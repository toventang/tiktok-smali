package com.ss.ttvideoengine.q;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.networkpredictor.ISpeedPredictor;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ISpeedPredictor f153179a;

    /* renamed from: b  reason: collision with root package name */
    public static ISpeedPredictor f153180b;

    static {
        Covode.recordClassIndex(101758);
    }

    public static void a(int i2) {
        ISpeedPredictor iSpeedPredictor = f153179a;
        if (iSpeedPredictor != null) {
            iSpeedPredictor.setSpeedQueueSize(i2);
        }
    }
}
