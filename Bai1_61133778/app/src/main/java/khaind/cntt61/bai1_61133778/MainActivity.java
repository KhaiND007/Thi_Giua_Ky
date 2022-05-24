package khaind.cntt61.bai1_61133778;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvKQ;
    EditText edSoA, edSoB, edH;
    Button btnTinhCV, btnTinhDT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvKQ = (TextView) findViewById(R.id.KQ);
        edSoA = (EditText) findViewById(R.id.edA);
        edSoB = (EditText) findViewById(R.id.edB);
        edH = (EditText) findViewById(R.id.edH);
        btnTinhCV = (Button) findViewById(R.id.btnCV);
        btnTinhDT = (Button) findViewById(R.id.btnDT);

    }

    public void TinhChuVi(View v) {
        String soA = edSoA.getText().toString();
        String soB = edSoB.getText().toString();

        int a = Integer.parseInt(soA);
        int b = Integer.parseInt(soB);
        int kq = (a+b)*2;
        String KQ = String.valueOf(kq);
        tvKQ.setText(KQ);
    }
    public void TinhDienTich(View v) {
        String soA = edSoA.getText().toString();
        String soH = edH.getText().toString();

        int a = Integer.parseInt(soA);
        int h = Integer.parseInt(soH);
        int kq = a*h;
        String KQ = String.valueOf(kq);
        tvKQ.setText(KQ);
    }
}