import java.awt.*;

/**
 * Login
 */
public class Login extends Frame {
    public Login() {
        setTitle("User Registration Form");

        Label Registration = new Label("REGSITATION FORM");
        Registration.setBounds(50, 50, 150, 50);
        add(Registration);

        Label namet = new Label("name");
        namet.setBounds(50, 100, 50, 30);
        add(namet);
        TextField name = new TextField();
        name.setBounds(150, 100, 100, 30);
        add(name);

        Button saveDetailsButton = new Button("Save Detail");
        saveDetailsButton.setBounds(220, 50, 100, 30);
        add(saveDetailsButton);

        TextField Age = new TextField("18");
        Age.setBounds(100, 100, 100, 30);
        add(Age);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkmale = new Checkbox("male", cbg, true);
        checkmale.setBounds(50, 140, 100, 30);
        add(checkmale);

        Checkbox checkfemale = new Checkbox("female", cbg, false);
        checkfemale.setBounds(150, 140, 100, 30);
        add(checkfemale);

        Checkbox checkother = new Checkbox("other", cbg, false);
        checkother.setBounds(250, 140, 100, 30);
        add(checkother);

        Checkbox drawing = new Checkbox("drawing");
        drawing.setBounds(200, 180, 100, 30);
        add(drawing);

        Checkbox isha = new Checkbox("isha");
        isha.setBounds(300, 180, 100, 30);
        add(isha);

        Choice course = new Choice();
        course.add("java");
        course.add("c++");
        course.add("c +");

        course.setBounds(50, 190, 100, 30);
        add(course);

        TextArea text = new TextArea("my name is utsav wagle");
        text.setBounds(100, 300, 200, 80);
        add(text);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        Login hunter = new Login();
    }
}