package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {
    EditText editTextPassword;
    EditText editTextNewPassword;
    EditText editTextConfirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        editTextPassword = findViewById(R.id.edt_reset_code);
        editTextNewPassword = findViewById(R.id.edt_new_password);
        editTextConfirmPassword = findViewById(R.id.edt_confirm_password);
    }

    public void postChangePassword(View view) {
        if(TextUtils.isEmpty(editTextPassword.getText().toString().trim()) && TextUtils.isEmpty(editTextNewPassword.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Password tidak boleh kosong!",
                    Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(editTextPassword.getText().toString())) {
            Toast.makeText(view.getContext(), "Password tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(editTextNewPassword.getText().toString())) {
            Toast.makeText(view.getContext(), "Password tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(editTextConfirmPassword.getText().toString())) {
            Toast.makeText(view.getContext(), "Password tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(editTextConfirmPassword.getText().toString().trim()) != TextUtils.isEmpty(editTextNewPassword.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Password tidak sama!",
                    Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
            startActivity(i);
        }
    }
}
