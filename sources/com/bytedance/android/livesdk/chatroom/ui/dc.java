package com.bytedance.android.livesdk.chatroom.ui;

import android.view.ScaleGestureDetector;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;

public final class dc extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16107a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f16108b;

    static {
        Covode.recordClassIndex(8917);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8918);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public dc(boolean z) {
        this.f16108b = z;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (scaleGestureDetector == null) {
            return false;
        }
        if (this.f16108b && ((double) scaleGestureDetector.getScaleFactor()) > 1.2d) {
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdkapi.f.a(2));
            b.a.a("screen_rotate").a().a(StringSet.type, "portrait_to_landscape").b();
            return true;
        } else if (this.f16108b || ((double) scaleGestureDetector.getScaleFactor()) >= 0.8d) {
            return false;
        } else {
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdkapi.f.a(1));
            b.a.a("screen_rotate").a().a(StringSet.type, "landscape_to_portrait").b();
            return true;
        }
    }
}
