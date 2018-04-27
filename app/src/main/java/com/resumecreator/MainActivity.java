package com.resumecreator;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.itextpdf.text.pdf.BaseFont;

import java.io.File;

public class MainActivity extends Activity {

    private static final String LOG_TAG = "GeneratePDF";


    private BaseFont bfBold;
    private String filename;
    String dir="/Attendancesystem";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void GeneratePDF(View view) {

        // TODO Auto-generated method stub
        filename = "bhoomika";
        String filecontent = "prajapati";
        Metodos fop = new Metodos();


        if (fop.write(filename, filecontent)) {
            Toast.makeText(getApplicationContext(), filename + ".pdf cddreated", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "I/O error",
                    Toast.LENGTH_SHORT).show();
        }
    }




    public void displayPDF(View view) {

        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/"+filename+".pdf");
        Intent target = new Intent(Intent.ACTION_VIEW);
        target.setDataAndType(Uri.fromFile(file), "application/pdf");
        target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

      //  Intent intent = Intent.createChooser(target, "Open File");
        try {
            startActivity(target);
        } catch (ActivityNotFoundException e) {
            // Instruct the user to install a PDF reader here, or something
        }
    }

}

