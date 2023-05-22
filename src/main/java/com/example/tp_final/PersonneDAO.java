package com.example.tp_final;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonneDAO implements IPersonneDAO {

    public static void main(String[] args) {
        PersonneDAO personneDAO = new PersonneDAO();
        personneDAO.getPersonnes().forEach(System.out::println);
    }

    @Override
    public List<Personne> getPersonnes() {
        List<Personne> personnes = new ArrayList<>();

        try (Connection connection = JDBCConnection.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("select * from personne");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Personne newPersonne = new Personne();
                newPersonne.setId(resultSet.getInt("id"));
                newPersonne.setNom(resultSet.getString("nom"));
                newPersonne.setPrenom(resultSet.getString("prenom"));
                newPersonne.setAdresse(resultSet.getString("adresse"));
                personnes.add(newPersonne);
            }

            connection.close();
            return personnes;
        } catch (Exception e) {
            e.printStackTrace();
            return personnes;
        }
    }
}
