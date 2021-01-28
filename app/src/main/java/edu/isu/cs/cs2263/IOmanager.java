package edu.isu.cs.cs2263;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IOmanager {
    public void dataFile() {
        try {
            Student pawan = new Student("Pawan", "Acharya", 1181, "cs", "cs1181");
            List<Student> List1 = new ArrayList<>();
            Writer writer = new FileWriter("user.jason");
            new Gson().toJson(List1, writer);
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void readData() {
        try (FileReader reader = new FileReader("user.json")) {
            Files.readString(Paths.get("user.json"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}