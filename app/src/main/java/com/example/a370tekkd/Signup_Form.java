//package com.example.a370tekkd;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ProgressBar;
//import android.widget.RadioButton;
//import android.widget.Toast;
//import android.view.View.OnClickListener;
//
//import com.google.android.gms.tasks.OnCompleteListener;
//
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//
//public class Signup_Form extends AppCompatActivity{
//
//    EditText txtFullName, txtUsername, txtEmail, txtPassword, txtConfirmPassword;
//    Button btnregister;
//    ProgressBar progressBar;
//    RadioButton radioGenderMale, radioGenderFemale;
//    String gender="";
//    DatabaseReference databaseReference;
//    FirebaseAuth firebaseAuth;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_signup__form);
//        getSupportActionBar().setTitle("SignUp Form");
//
//        txtFullName = (EditText)findViewById(R.id.txtFullName);
//        txtUsername = (EditText)findViewById(R.id.txtUsername);
//        txtEmail = (EditText)findViewById(R.id.txt_email);
//        txtPassword = (EditText)findViewById(R.id.txt_password);
//
//
//        radioGenderMale = (RadioButton)findViewById(R.id.radio_male);
//        radioGenderFemale = (RadioButton)findViewById(R.id.radio_female);
//
//        databaseReference = FirebaseDatabase.getInstance().getReference("Nurse");
//        firebaseAuth = FirebaseAuth.getInstance();
//
//        btnregister = (Button)findViewById(R.id.buttonRegisters);
//        Log.d("register", "onCreate: hellooo");
//        btnregister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("in listener", "onCreate: hellooo 234");
//            }
//        });
//
//    }
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_signup__form);
////        getSupportActionBar().setTitle("SignUp Form");
////
////        txtFullName = (EditText)findViewById(R.id.txtFullName);
////        txtUsername = (EditText)findViewById(R.id.txtUsername);
////        txtEmail = (EditText)findViewById(R.id.txt_email);
////        txtPassword = (EditText)findViewById(R.id.txt_password);
////
////
////        radioGenderMale = (RadioButton)findViewById(R.id.radio_male);
////        radioGenderFemale = (RadioButton)findViewById(R.id.radio_female);
////
////        databaseReference = FirebaseDatabase.getInstance().getReference("Nurse");
////        firebaseAuth = FirebaseAuth.getInstance();
////
////        btnregister = (Button)findViewById(R.id.btnRegister);
////        Log.d("register", "onCreate: hellooo");
////
////        btnregister.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Log.d("in listener", "onCreate: hellooo 234");
////                final String fullName = txtFullName.getText().toString();
////                final String userName = txtUsername.getText().toString();
////                final String email = txtEmail.getText().toString();
////                String password = txtPassword.getText().toString();
////
////
////                if (radioGenderMale.isChecked()){
////
////                    gender="Male";
////                }
////                if (radioGenderFemale.isChecked()){
////                    gender="Female";
////                }
////
////
////                if (TextUtils.isEmpty(email)){
////                    Toast.makeText(Signup_Form.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
////                    return;
////                }
////                if (TextUtils.isEmpty(password)){
////                    Toast.makeText(Signup_Form.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
////                    return;
////                }
////                if (TextUtils.isEmpty(fullName)){
////                    Toast.makeText(Signup_Form.this, "Please Enter Full Name", Toast.LENGTH_SHORT).show();
////                    return;
////                }
////                if (TextUtils.isEmpty(userName)){
////                    Toast.makeText(Signup_Form.this, "Please Enter User Name", Toast.LENGTH_SHORT).show();
////                    return;
////                }
////
////
////
////                    firebaseAuth.createUserWithEmailAndPassword(email, password)
////                            .addOnCompleteListener(Signup_Form.this, new OnCompleteListener<AuthResult>() {
////                                @Override
////                                public void onComplete(@NonNull Task<AuthResult> task) {
////
////                                    Log.d("firebase", "onCreate: hellooo 567");
////                                    progressBar.setVisibility(View.GONE);
////
////                                    if (task.isSuccessful()) {
////
////
////                                        nurse information = new nurse(
////                                                fullName,
////                                                userName,
////                                                email,
////                                                gender
////                                        );
////
////                                        FirebaseDatabase.getInstance().getReference("nurse")
////                                                .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
////                                                .setValue(information).addOnCompleteListener(new OnCompleteListener<Void>() {
////                                            @Override
////                                            public void onComplete(@NonNull Task<Void> task) {
////
////                                                Toast.makeText(Signup_Form.this, "Registration Complete", Toast.LENGTH_SHORT).show();
////                                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
////
////                                            }
////                                        });
////                                    }
////                            }
////
////                });
////
////
////
////
////                progressBar.setVisibility(View.VISIBLE);
////
////
////
////        };
////
////
////    });
////}
//
//
//};
package com.example.a370tekkd;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import android.util.Log;
        import android.content.Intent;
        import android.os.Bundle;
        import android.text.TextUtils;
        //import android.text.TextUtils;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ProgressBar;
        import android.widget.Toast;
        import com.google.android.gms.tasks.OnCompleteListener;
        import com.google.android.gms.tasks.Task;
        import com.google.firebase.auth.AuthResult;
        import com.google.firebase.auth.FirebaseAuth;
        import android.widget.ProgressBar;
        import android.widget.RadioButton;

        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;

public class Signup_Form extends AppCompatActivity {


    EditText txtFullName, txtUsername, txtEmail, txtPassword;
    Button btn_Register;
    RadioButton radioGenderMale, radioGenderFemale;
    DatabaseReference databaseReference;
    String gender="";
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_signup__form);
         getSupportActionBar().setTitle("SignUp Form");



        txtFullName = (EditText)findViewById(R.id.txtFullName);
        txtUsername = (EditText)findViewById(R.id.txtUsername);
        txtEmail = (EditText)findViewById(R.id.txt_email);
        txtPassword = (EditText)findViewById(R.id.txtPassword);
        btn_Register = (Button) findViewById(R.id.btnRegister);
        radioGenderMale = (RadioButton)findViewById(R.id.radio_male);
        radioGenderFemale = (RadioButton)findViewById((R.id.radio_female)) ;

        databaseReference = FirebaseDatabase.getInstance().getReference("nurse");

        firebaseAuth = FirebaseAuth.getInstance();


        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //what happens it

                createUser();


            }
        })
        ;

    }

    public void createUser(){



        final String fullName =txtFullName.getText().toString();
        final String Username =txtUsername.getText().toString();
        final String Email =txtEmail.getText().toString();
        Log.d("in listener", "onCreate: me");
//        final String fullName = txtFullName.getText().toString();
//        final String userName = txtUsername.getText().toString();
//        final String email = txtEmail.getText().toString();
        String password = txtPassword.getText().toString();



                if (radioGenderMale.isChecked()){

                    gender="Male";
               }
              if (radioGenderFemale.isChecked()){
                    gender="Female";
                   Log.d("in listener", "onCreate: female");
              }

              if (TextUtils.isEmpty(Email)){
                    Toast.makeText(Signup_Form.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                   return;
                }
                if (TextUtils.isEmpty(password)){
                    Toast.makeText(Signup_Form.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(fullName)){
                    Toast.makeText(Signup_Form.this, "Please Enter Full Name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(Username)){
                    Toast.makeText(Signup_Form.this, "Please Enter User Name", Toast.LENGTH_SHORT).show();
                    return;
                }
        Log.d("in listener", "onCreate: Well");

        firebaseAuth.createUserWithEmailAndPassword(Email, password)
                            .addOnCompleteListener(Signup_Form.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {




                                    if (task.isSuccessful()) {


                                        nurse information = new nurse(
                                                fullName,
                                                Username,
                                                Email,
                                                gender
                                        );

                                        FirebaseDatabase.getInstance().getReference("nurse")
                                                .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                                .setValue(information).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {

                                                Toast.makeText(Signup_Form.this, "Registration Complete", Toast.LENGTH_SHORT).show();
                                                startActivity(new Intent(getApplicationContext(), MainActivity.class));

                                            }
                                        });
                                    }
                                    Log.d("firebase", "onCreate: hellooo 567");
                            }

                });
    }
}
