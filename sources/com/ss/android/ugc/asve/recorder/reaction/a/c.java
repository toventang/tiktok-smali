package com.ss.android.ugc.asve.recorder.reaction.a;

import android.content.Context;
import android.content.res.TypedArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.reaction.model.b;
import com.ss.android.ugc.asve.recorder.reaction.model.d;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<d> f62323a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f62324b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62325c = "ReactionWindowFactory";

    /* renamed from: d  reason: collision with root package name */
    private int f62326d;

    /* renamed from: e  reason: collision with root package name */
    private int f62327e;

    static {
        Covode.recordClassIndex(38295);
    }

    private final void a(Context context, int i2, int i3, int i4) {
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(i2);
        l.b(obtainTypedArray, "");
        int length = obtainTypedArray.length();
        this.f62327e = length;
        for (int i5 = 0; i5 < length; i5++) {
            File a2 = a(context, "reaction_mask_rectangular", obtainTypedArray, i5);
            if (a2 != null) {
                String absolutePath = a2.getAbsolutePath();
                l.b(absolutePath, "");
                this.f62323a.add(new com.ss.android.ugc.asve.recorder.reaction.model.c(absolutePath, i3, i4, 120, 213, 100, 178));
            } else {
                return;
            }
        }
        obtainTypedArray.recycle();
    }

    private final void b(Context context, int i2, int i3, int i4) {
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(i2);
        l.b(obtainTypedArray, "");
        int length = obtainTypedArray.length();
        this.f62326d = length;
        for (int i5 = 0; i5 < length; i5++) {
            File a2 = a(context, "reaction_mask_circle", obtainTypedArray, i5);
            if (a2 != null) {
                String absolutePath = a2.getAbsolutePath();
                l.b(absolutePath, "");
                this.f62323a.add(new b(absolutePath, i3, i4, 120, 120, 100, 100));
            } else {
                return;
            }
        }
        obtainTypedArray.recycle();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a A[SYNTHETIC, Splitter:B:26:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[SYNTHETIC, Splitter:B:35:0x009a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.File a(android.content.Context r8, java.lang.String r9, android.content.res.TypedArray r10, int r11) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.asve.recorder.reaction.a.c.a(android.content.Context, java.lang.String, android.content.res.TypedArray, int):java.io.File");
    }

    public c(Context context, int i2, int i3, int i4, int i5) {
        l.d(context, "");
        a(context, i4, i2, i3);
        b(context, i5, i2, i3);
    }
}
