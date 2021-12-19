package com.bytedance.android.live.broadcast.api;

import android.view.ScaleGestureDetector;
import com.bytedance.android.live.broadcast.api.d.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.j.h;
import h.z;

public final class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public float f7461a;

    /* renamed from: b  reason: collision with root package name */
    public final a f7462b;

    /* renamed from: c  reason: collision with root package name */
    private float f7463c;

    /* renamed from: d  reason: collision with root package name */
    private float f7464d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private final DataChannel f7465e;

    static {
        Covode.recordClassIndex(3669);
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        DataChannel dataChannel = this.f7465e;
        if (dataChannel != null) {
            dataChannel.a(i.class, (Object) true);
        }
        this.f7463c = this.f7461a;
        return super.onScaleBegin(scaleGestureDetector);
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i2;
        if (this.f7464d == -1.0f) {
            a aVar = this.f7462b;
            if (aVar != null) {
                i2 = aVar.d();
            } else {
                i2 = -1;
            }
            this.f7464d = (float) i2;
        }
        if (this.f7462b == null) {
            return false;
        }
        float f2 = this.f7464d;
        if (f2 <= 0.0f) {
            return false;
        }
        if (scaleGestureDetector == null) {
            return true;
        }
        float b2 = h.b(0.0f, ((f2 / 1000.0f) * (scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan())) + this.f7461a);
        this.f7461a = b2;
        float c2 = h.c(b2, this.f7464d);
        this.f7461a = c2;
        this.f7462b.a(c2);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScaleEnd(android.view.ScaleGestureDetector r5) {
        /*
            r4 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r4.f7465e
            if (r2 == 0) goto L_0x000e
            java.lang.Class<com.bytedance.android.live.broadcast.api.i> r1 = com.bytedance.android.live.broadcast.api.i.class
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.a(r1, r0)
        L_0x000e:
            super.onScaleEnd(r5)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.f7465e
            if (r1 == 0) goto L_0x001f
            java.lang.Class<com.bytedance.android.livesdk.j.aw> r0 = com.bytedance.android.livesdk.j.aw.class
            java.lang.Object r2 = r1.b(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L_0x0049
        L_0x001f:
            java.lang.String r3 = "live_take_detail"
        L_0x0021:
            float r2 = r4.f7461a
            float r1 = r4.f7463c
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            java.lang.String r2 = "zoom_in"
        L_0x002b:
            java.lang.String r0 = "livesdk_zoom_in"
            com.bytedance.android.livesdk.ab.b r0 = com.bytedance.android.livesdk.ab.b.a.a(r0)
            com.bytedance.android.livesdk.ab.b r1 = r0.d(r3)
            java.lang.String r0 = "hand_gesture"
            com.bytedance.android.livesdk.ab.b r0 = r1.a(r0, r2)
            r0.b()
            return
        L_0x003f:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            java.lang.String r2 = "zoom_out"
            goto L_0x002b
        L_0x0046:
            java.lang.String r2 = "no_change"
            goto L_0x002b
        L_0x0049:
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x0053
            java.lang.String r3 = "guest_connect"
            goto L_0x0021
        L_0x0053:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x001f
            java.lang.String r3 = "host_connect"
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.api.b.onScaleEnd(android.view.ScaleGestureDetector):void");
    }

    public b(a aVar, DataChannel dataChannel) {
        this.f7462b = aVar;
        this.f7465e = dataChannel;
        if (dataChannel != null) {
            dataChannel.b(h.class, (h.f.a.b) new h.f.a.b<Float, z>(this) {
                /* class com.bytedance.android.live.broadcast.api.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(3670);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Float f2) {
                    float floatValue = f2.floatValue();
                    this.this$0.f7461a = floatValue;
                    a aVar = this.this$0.f7462b;
                    if (aVar != null) {
                        aVar.a(floatValue);
                    }
                    return z.f158842a;
                }
            });
        }
    }
}
