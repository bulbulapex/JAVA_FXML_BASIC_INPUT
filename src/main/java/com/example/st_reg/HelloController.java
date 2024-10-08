package com.example.st_reg;


import com.example.st_reg.enums.Departments;
import com.example.st_reg.models.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    public TextArea textAreaDetails;
    @FXML
    private TextField nameField;
    @FXML
    ComboBox<String> departmentDropdown;
    @FXML
    ListView studentListView;
    ObservableList<Student> studentList;
    @FXML
    CheckBox genderMaleCheckBox;
    @FXML
    CheckBox genderFemaleCheckBox;
    @FXML
    private RadioButton genderMale, genderFemale;

    public void initialize() {
        System.out.println("Inititalizing Hello Controller");
        ObservableList<String> options = FXCollections.observableArrayList();
        for(Departments departments : Departments.values()) {
            options.add(departments.getFullName());
        }
        //        options.add("CSE");
        //        options.add("BBA");
        //        options.add("EEE");

        departmentDropdown.setItems(options);
//        departmentDropdown.setEditable(true);
        studentList = FXCollections.observableArrayList();
        studentListView.setItems(studentList);

        Student student = new Student();
        textAreaDetails.setText(student.getDetails());
    }

    public void submitAction(ActionEvent event) {
        String name = nameField.getText();
        String department = departmentDropdown.getSelectionModel().getSelectedItem();
        /*boolean isMale = genderMaleCheckBox.isSelected();
        boolean isFemale = genderFemaleCheckBox.isSelected();*/
        Student student = new Student();
        student.setName(name);
        student.setDepartment(department);
        /*if(isMale){
            student.setGender("Male");
        }
        else if(isFemale){
            student.setGender("Female");
        }*/

        if(genderMale.isSelected()){
            student.setGender("Male");
        }else if(genderFemale.isSelected()){
            student.setGender("Female");
        }


        System.out.println(student);
        student.fWriteFile();
        //System.out.println(student.getDetails());
        studentList.add(student);
        textAreaDetails.setText(student.getDetails());

    }

    public void handleResetAction(ActionEvent actionEvent) {
        nameField.setText("");
        departmentDropdown.getSelectionModel().clearSelection();
        genderMaleCheckBox.setSelected(false);
        genderFemaleCheckBox.setSelected(false);
    }
}