package com.example.android.newmusic;

import android.os.Parcel;
import android.os.Parcelable;

//Custom call created to pull information need for various playlist.

public class Music {

    /**
     * Name of song
     */
    private String mSongName;

    /**
     * Name of Album
     */
    private String mAlbumName;

    /**
     * Album Cover Image
     */
    private int mAlbumCover;

    public Music(int albumCover, String songName, String albumName) {
        mSongName = songName;
        mAlbumName = albumName;
        mAlbumCover = albumCover;
    }
    /**
     * Get song title.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get album name.
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Get album image.
     */
    public int getImageResource() {
        return mAlbumCover;
    }
}
