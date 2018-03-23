package com.rafi.buskoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class ShowNotice extends AppCompatActivity {

    PDFView pdfView;
    static File file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_notice);

        //file = new File();

        pdfView = (PDFView) findViewById(R.id.pdf_view);
        pdfView.fromFile(file).load();
    }
}
