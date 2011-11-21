package com.steganography;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class steganography extends Activity {
    
    private static final int SELECT_PICTURE = 1;
    private String selectedImagePath;
    private ImageView img;
    private static final int SELECT_IMAGE = 0; // selector for image gallery call
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
                setContentView(R.layout.main);
        ((Button) findViewById(R.id.Button01))
                .setOnClickListener(new OnClickListener() {

                    public void onClick(View arg0) {
                        startActivityForResult(new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI), SELECT_IMAGE);
                    }
                });
    }
    
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
      super.onActivityResult(requestCode, resultCode, data);
      if (requestCode == SELECT_IMAGE)
        if (resultCode == Activity.RESULT_OK) {
          Uri selectedImage = data.getData();
          // TODO Do something with the select image URI
        } 
    }
}

   