package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class PublisherParameters {
    public int audioKBitrate = 96;
    public int audiochannels = 1;
    public int audiosamplerate = 44100;
    public int defaultLayout = 1;
    public String extraInfo;
    public int framerate = 15;
    public int height = 640;
    public int kBitrate = 500;
    public int lifecycle = 1;
    public String mosaicStream;
    public boolean owner;
    public int width = 360;

    static {
        Covode.recordClassIndex(100783);
    }
}
