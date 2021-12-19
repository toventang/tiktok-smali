package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public class bh {

    /* renamed from: a  reason: collision with root package name */
    public int f151096a;

    /* renamed from: b  reason: collision with root package name */
    public a f151097b;

    /* renamed from: c  reason: collision with root package name */
    public float f151098c;

    /* renamed from: d  reason: collision with root package name */
    public float f151099d;

    /* renamed from: e  reason: collision with root package name */
    public float f151100e;

    /* renamed from: f  reason: collision with root package name */
    public float f151101f;

    static {
        Covode.recordClassIndex(99352);
    }

    public enum a {
        BEGAN,
        MOVED,
        STATIONARY,
        ENDED,
        CANCELED;

        static {
            Covode.recordClassIndex(99353);
        }
    }

    public String toString() {
        return "pointerId: " + this.f151096a + ", TouchEvent: " + this.f151097b + ", x: " + this.f151098c + ", y: " + this.f151099d + ", force: " + this.f151100e + ", majorRadius: " + this.f151101f;
    }
}
