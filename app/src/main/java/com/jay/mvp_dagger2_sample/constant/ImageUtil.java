package com.jay.mvp_dagger2_sample.constant;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;

public class ImageUtil {

    public static Bitmap getBitmapFromAssets(AssetManager assetManager, String fileName){
        /*
            AssetManager
                Provides access to an application's raw asset files.
        */

        /*
            public final AssetManager getAssets ()
                Retrieve underlying AssetManager storage for these resources.
        */
        InputStream is;
        Bitmap bitmap = null;
        try{
            /*
                public final InputStream open (String fileName)
                    Open an asset using ACCESS_STREAMING mode. This provides access to files that
                    have been bundled with an application as assets -- that is,
                    files placed in to the "assets" directory.

                    Parameters
                        fileName : The name of the asset to open. This name can be hierarchical.
                    Throws
                        IOException
            */
            is = assetManager.open(fileName);

            /*
                BitmapFactory
                    Creates Bitmap objects from various sources, including files, streams, and byte-arrays.
            */

            /*
                public static Bitmap decodeStream (InputStream is)
                    Decode an input stream into a bitmap. If the input stream is null, or cannot
                    be used to decode a bitmap, the function returns null. The stream's
                    position will be where ever it was after the encoded data was read.

                    Parameters
                        is : The input stream that holds the raw data to be decoded into a bitmap.
                    Returns
                        The decoded bitmap, or null if the image data could not be decoded.
            */
            bitmap = BitmapFactory.decodeStream(is);

            is.close();//close input stream
        }catch(IOException e){
            e.printStackTrace();
        }

        return bitmap;
    }
}
