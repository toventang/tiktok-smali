package com.ss.android.vesdk;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.TESystemUtils;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public int f151351a;

    /* renamed from: b  reason: collision with root package name */
    public int f151352b;

    /* renamed from: c  reason: collision with root package name */
    public int f151353c;

    /* renamed from: d  reason: collision with root package name */
    public int f151354d;

    /* renamed from: e  reason: collision with root package name */
    public int f151355e;

    /* renamed from: f  reason: collision with root package name */
    public int f151356f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f151357g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f151358h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f151359i;

    static {
        Covode.recordClassIndex(99538);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public m f151360a = new m((byte) 0);

        static {
            Covode.recordClassIndex(99539);
        }

        public a() {
        }

        public final a a(int i2) {
            this.f151360a.f151355e = i2;
            return this;
        }

        public final a b(boolean z) {
            this.f151360a.f151358h = z;
            return this;
        }

        public a(m mVar) {
            this.f151360a = mVar;
        }

        public final a a(boolean z) {
            if (z) {
                Pair<Integer, Integer> suggestedOutputProperty = TESystemUtils.getSuggestedOutputProperty();
                if (suggestedOutputProperty != null) {
                    this.f151360a.f151352b = ((Integer) suggestedOutputProperty.first).intValue();
                    this.f151360a.f151356f = ((Integer) suggestedOutputProperty.second).intValue();
                }
            } else {
                this.f151360a.f151352b = 44100;
                this.f151360a.f151356f = 256;
            }
            this.f151360a.f151357g = z;
            return this;
        }
    }

    private m() {
        this.f151351a = 2;
        this.f151352b = 44100;
        this.f151353c = 16;
        this.f151354d = 1;
        this.f151356f = 256;
        this.f151359i = true;
    }

    /* synthetic */ m(byte b2) {
        this();
    }
}
