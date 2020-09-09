package com.gaming.know_your_ability.Home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gaming.know_your_ability.R;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class CameraFragment extends Fragment {
    private static final String TAG = "CameraFragment";
   // private static final int CAPTURE_MEDIA = 368;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_camera, container, false);

        return view;
    }
  /*  private void launchCamera() {
        SandriosCamera
                .with()
                .setShowPicker(true)
                .setShowPickerType(CameraConfiguration.VIDEO)
                .setVideoFileSize(20)
                .setMediaAction(CameraConfiguration.MEDIA_ACTION_BOTH)
                .enableImageCropping(true)
                .launchCamera(activity);

        @Override
        protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            if (resultCode == Activity.RESULT_OK
                    && requestCode == SandriosCamera.RESULT_CODE
                    && data != null) {
                if (data.getSerializableExtra(SandriosCamera.MEDIA) instanceof MediaStore.Video.Media) {
                    MediaStore.Video.Media media = (MediaStore.Video.Media) data.getSerializableExtra(SandriosCamera.MEDIA);

                    Log.e("File", "" + media.getPath());
                    Log.e("Type", "" + media.getType());
                    Toast.makeText(getApplicationContext(), "Media captured.", Toast.LENGTH_SHORT).show();
                }
            }
        }

    }*/
}
