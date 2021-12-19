package com.ss.android.vesdk;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.common.j;
import com.ss.android.ttve.monitor.b;
import com.ss.android.ttve.monitor.e;
import com.ss.android.ttve.monitor.i;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.clipparam.VEClipParam;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.f.c;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import com.ss.android.vesdk.g.a;
import com.ss.android.vesdk.jni.TEAudioEffectInterface;
import com.ss.android.vesdk.runtime.h;
import com.ss.android.vesdk.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab implements c {

    /* renamed from: a  reason: collision with root package name */
    private final x f150890a;

    /* renamed from: b  reason: collision with root package name */
    private final TEInterface f150891b;

    /* renamed from: c  reason: collision with root package name */
    private final TEAudioEffectInterface f150892c;

    /* renamed from: d  reason: collision with root package name */
    private int f150893d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f150894e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f150895f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f150896g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f150897h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f150898i = -1;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ttve.model.c f150899j;

    /* renamed from: k  reason: collision with root package name */
    private h f150900k;

    static {
        Covode.recordClassIndex(99260);
    }

    @Override // com.ss.android.vesdk.f.c
    public final void c() {
        this.f150899j = null;
    }

    @Override // com.ss.android.vesdk.f.c
    public final void i() {
        this.f150898i = -1;
    }

    @Override // com.ss.android.vesdk.f.c
    public final com.ss.android.ttve.model.c d() {
        return this.f150899j;
    }

    @Override // com.ss.android.vesdk.f.c
    public final int e() {
        return this.f150893d;
    }

    @Override // com.ss.android.vesdk.f.c
    public final int f() {
        return this.f150895f;
    }

    @Override // com.ss.android.vesdk.f.c
    public final int g() {
        return this.f150896g;
    }

    @Override // com.ss.android.vesdk.f.c
    public final int h() {
        return this.f150897h;
    }

    @Override // com.ss.android.vesdk.f.c
    public final int a(int i2, String str, int i3, int i4, String str2) {
        MethodCollector.i(8251);
        an.c("VEEditor_VEFilterInvoker", "enableFilterEffectWithTag... " + i2 + " ");
        if (i2 < 0 || i2 > this.f150891b.getDuration() || TextUtils.isEmpty(str)) {
            an.d("VEEditor_VEFilterInvoker", "enableFilterEffectWithTag... error. seqIn = " + i2 + ", effectPath = " + str);
            MethodCollector.o(8251);
            return -100;
        }
        TEVideoUtils.nativeCancelCompileProbe();
        int duration = this.f150891b.getDuration();
        String str3 = "";
        String str4 = str2 == null ? str3 : str2;
        int[] addFilters = this.f150891b.addFilters(new int[]{0}, new String[]{"video effect"}, new int[]{i2}, new int[]{duration}, new int[]{0}, new int[]{8});
        this.f150891b.setFilterParam(addFilters[0], "effect res path", str);
        this.f150891b.setFilterParam(addFilters[0], "effect sticker tag", str4);
        this.f150891b.setFilterParam(addFilters[0], "effect sticker id", "0");
        this.f150891b.setFilterParam(addFilters[0], "effect req id", "0");
        a aVar = new a();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str3 = split[split.length - 1];
            }
        }
        aVar.a("iesve_veeditor_filter_effect_id", str3);
        e.a("iesve_veeditor_filter_effect", 1, aVar);
        i.a aVar2 = new i.a();
        aVar2.f61226a = str;
        aVar2.f61227b = i2;
        this.f150890a.ac.a(0, addFilters[0], aVar2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("seqIn", i2);
            jSONObject.put("stickerId", str3);
            jSONObject.put("effectTag", str2);
            jSONObject.put("filterIndex", addFilters[0]);
            b.a("vesdk_event_editor_filter_effect", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        int i5 = addFilters[0];
        MethodCollector.o(8251);
        return i5;
    }

    @Override // com.ss.android.vesdk.f.c
    public final int[] a(int[] iArr, int[] iArr2, String[] strArr) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] < 0 || iArr[i2] > this.f150891b.getDuration() || TextUtils.isEmpty(strArr[i2])) {
                return new int[]{-100};
            }
        }
        boolean[] zArr = new boolean[length];
        int[] iArr3 = new int[length];
        int[] iArr4 = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            zArr[i3] = false;
            iArr3[i3] = 0;
            iArr4[i3] = 0;
        }
        int length2 = strArr.length;
        String[] strArr2 = new String[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            strArr2[i4] = "";
        }
        return a(iArr, iArr2, strArr, iArr3, iArr4, strArr2);
    }

    @Override // com.ss.android.vesdk.f.c
    public final int[] a(int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2) {
        String str;
        if (iArr != null && iArr.length > 0 && iArr2 != null && iArr2.length > 0 && strArr2 != null && strArr2.length > 0 && strArr != null && strArr.length > 0) {
            an.c("VEEditor_VEFilterInvoker", "addFilterEffectsWithTag: in " + iArr[0] + ", out " + iArr2[0] + ", tag " + strArr2[0] + ", path " + strArr[0]);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < strArr2.length; i3++) {
            if ("FreezeFrame".equals(strArr2[i3])) {
                i2 = Math.max(i2, iArr2[i3]);
            }
        }
        this.f150890a.i(i2);
        int length = iArr.length;
        int[] iArr5 = new int[length];
        int[] iArr6 = new int[length];
        int[] iArr7 = new int[length];
        String[] strArr3 = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr5[i4] = 0;
            iArr6[i4] = 0;
            strArr3[i4] = "filter effect";
            iArr7[i4] = 8;
        }
        int[] addFilters = this.f150891b.addFilters(iArr5, strArr3, iArr, iArr2, iArr6, iArr7);
        if (length != addFilters.length) {
            int[] iArr8 = new int[length];
            Arrays.fill(iArr8, -1);
            return iArr8;
        }
        for (int i5 = 0; i5 < length; i5++) {
            this.f150891b.setFilterParam(addFilters[i5], "effect res path", strArr[i5]);
            TEInterface tEInterface = this.f150891b;
            int i6 = addFilters[i5];
            if (strArr2[i5] == null) {
                str = "";
            } else {
                str = strArr2[i5];
            }
            tEInterface.setFilterParam(i6, "effect sticker tag", str);
            this.f150891b.setFilterParam(addFilters[i5], "effect sticker id", new StringBuilder().append(iArr3[i5]).toString());
            this.f150891b.setFilterParam(addFilters[i5], "effect req id", new StringBuilder().append(iArr4[i5]).toString());
            i.a aVar = new i.a();
            aVar.f61226a = strArr[i5];
            aVar.f61227b = iArr[i5];
            aVar.f61228c = iArr2[i5] - iArr[i5];
            this.f150890a.ac.a(0, addFilters[i5], aVar);
        }
        return addFilters;
    }

    @Override // com.ss.android.vesdk.f.c
    public final int a(int[] iArr) {
        an.a("VEEditor_VEFilterInvoker", "deleteFilterEffects...");
        for (int i2 : iArr) {
            this.f150890a.ac.a(0, i2);
        }
        return this.f150891b.removeFilter(iArr);
    }

    @Override // com.ss.android.vesdk.f.c
    public final int a(String str, float f2, boolean z) {
        MethodCollector.i(8992);
        synchronized (this.f150890a) {
            try {
                an.a("VEEditor_VEFilterInvoker", "setColorFilter normal...");
                if (this.f150893d < 0) {
                    an.d("VEEditor_VEFilterInvoker", "setColorFilter... mColorFilterIndex error.");
                    return -105;
                } else if (f2 < 0.0f || str == null) {
                    an.d("VEEditor_VEFilterInvoker", "setColorFilter... param error. intensity = " + f2 + ", filterPath = " + str);
                    MethodCollector.o(8992);
                    return -100;
                } else {
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    if (this.f150899j == null) {
                        this.f150899j = new com.ss.android.ttve.model.c();
                    }
                    if (z || !str.equals(this.f150899j.f61171a) || this.f150899j.f61172b.length() != 0 || this.f150899j.f61174d != f2 || this.f150899j.f61173c != 1.0f || this.f150899j.f61176f) {
                        this.f150899j.f61171a = str;
                        this.f150899j.f61172b = "";
                        this.f150899j.f61173c = 1.0f;
                        this.f150899j.f61174d = f2;
                        this.f150899j.f61175e = f2;
                        this.f150899j.f61176f = false;
                        this.f150899j.f61177g = false;
                        this.f150891b.setFilterParam(this.f150893d, "left filter", str);
                        this.f150891b.setFilterParam(this.f150893d, "use filter res intensity", "false");
                        this.f150891b.setFilterParam(this.f150893d, "left filter intensity", String.valueOf(f2));
                        this.f150891b.setFilterParam(this.f150893d, "right filter", "");
                        this.f150891b.setFilterParam(this.f150893d, "filter position", "1.0");
                        a aVar = new a();
                        String str2 = "";
                        if (!TextUtils.isEmpty(str)) {
                            String[] split = str.split(File.separator);
                            if (split.length > 0) {
                                str2 = split[split.length - 1];
                            }
                        }
                        aVar.a("iesve_veeditor_set_filter_click_filter_id", str2);
                        e.a("iesve_veeditor_set_filter_click", 1, aVar);
                        com.ss.android.ttve.monitor.h.a(1, "te_composition_filter_id", str);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("filterPath", str);
                            jSONObject.put("intensity", String.valueOf(f2));
                            jSONObject.put("tag", "setColorFilter");
                            b.a("vesdk_event_editor_color_filter", jSONObject, "behavior");
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        MethodCollector.o(8992);
                        return 0;
                    }
                    MethodCollector.o(8992);
                    return 0;
                }
            } finally {
                MethodCollector.o(8992);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x015b  */
    @Override // com.ss.android.vesdk.f.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.String r9, java.lang.String r10, float r11, float r12, float r13) {
        /*
        // Method dump skipped, instructions count: 381
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.ab.a(java.lang.String, java.lang.String, float, float, float):int");
    }

    @Override // com.ss.android.vesdk.f.c
    public final int a(String str, double d2) {
        MethodCollector.i(9568);
        synchronized (this.f150890a) {
            try {
                an.a("VEEditor_VEFilterInvoker", "setLensHDRFilter modelPath = " + str + ", intensity = 1.0");
                int i2 = this.f150896g;
                if (i2 < 0) {
                    return -105;
                }
                if (str == null) {
                    str = "";
                    d2 = 0.0d;
                }
                this.f150891b.setFilterParam(i2, "lens hdr model path", str);
                this.f150891b.setFilterParam(this.f150896g, "lens hdr indensity", String.valueOf(d2));
                MethodCollector.o(9568);
                return 0;
            } finally {
                MethodCollector.o(9568);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.c
    public final void a(boolean z) {
        this.f150891b.setDleEnabled(z);
    }

    @Override // com.ss.android.vesdk.f.c
    public final void a(int i2) {
        this.f150891b.setDldThrVal(i2);
    }

    @Override // com.ss.android.vesdk.f.c
    public final int[] a(int i2, int i3, VECherEffectParam vECherEffectParam) {
        int length = vECherEffectParam.getMatrix().length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        String[] strArr = new String[length];
        int[] iArr4 = new int[length];
        int[] iArr5 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = 0;
            iArr2[i4] = 1;
            strArr[i4] = "audio chereffect";
            iArr3[i4] = 1;
            int i5 = i4 * 2;
            iArr4[i4] = (int) vECherEffectParam.getDuration()[i5];
            iArr5[i4] = (int) vECherEffectParam.getDuration()[i5 + 1];
        }
        int[] addFilters = this.f150891b.addFilters(iArr, strArr, iArr4, iArr5, iArr2, iArr3);
        for (int i6 = 0; i6 < length; i6++) {
            this.f150891b.setFilterParam(addFilters[i6], "cher_matrix", vECherEffectParam.getMatrix()[i6]);
        }
        return addFilters;
    }

    @Override // com.ss.android.vesdk.f.c
    public final int a(VEEditorModel vEEditorModel) {
        this.f150893d = vEEditorModel.f150778k;
        this.f150895f = vEEditorModel.f150779l;
        this.f150896g = vEEditorModel.f150780m;
        this.f150897h = vEEditorModel.f150776i;
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0127  */
    @Override // com.ss.android.vesdk.f.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.String r9, java.lang.String r10, float r11) {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.ab.a(java.lang.String, java.lang.String, float):int");
    }

    @Override // com.ss.android.vesdk.f.c
    public final void j() {
        this.f150892c.clearNative();
    }

    @Override // com.ss.android.vesdk.f.c
    public final int a() {
        try {
            int i2 = this.f150890a.P;
            int[] addFilters = this.f150891b.addFilters(new int[]{0, 0, 0}, new String[]{"color filter", "effect hdr filter", "lens hdr filter"}, new int[]{0, 0, 0}, new int[]{i2, i2, i2}, new int[]{0, 0, 0}, new int[]{7, 16, 33}, new int[]{1, 0, 0});
            this.f150893d = addFilters[0];
            this.f150895f = addFilters[1];
            this.f150896g = addFilters[2];
            x xVar = this.f150890a;
            if (xVar.f151512a != null && xVar.f151512a.isMVInitialedInternal()) {
                for (int i3 : addFilters) {
                    xVar.f151512a.addMVFilterInternal(i3);
                }
            }
            return 0;
        } catch (NullPointerException unused) {
            throw new z(-1, "init failed: VESDK need to be init");
        }
    }

    @Override // com.ss.android.vesdk.f.c
    public final void b() {
        an.d("VEEditor_VEFilterInvoker", "updateFilters");
        int duration = this.f150891b.getDuration();
        int i2 = this.f150893d;
        if (i2 >= 0) {
            this.f150891b.adjustFilterInOut(i2, 0, duration);
        }
        int i3 = this.f150895f;
        if (i3 >= 0) {
            this.f150891b.adjustFilterInOut(i3, 0, duration);
        }
        int i4 = this.f150896g;
        if (i4 >= 0) {
            this.f150891b.adjustFilterInOut(i4, 0, duration);
        }
    }

    @Override // com.ss.android.vesdk.f.c
    public final void b(boolean z) {
        this.f150891b.setDleEnabledPreview(z);
    }

    @Override // com.ss.android.vesdk.f.c
    public final void c(boolean z) {
        this.f150891b.setDldEnabled(z);
    }

    @Override // com.ss.android.vesdk.f.c
    public final float a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        return this.f150891b.getColorFilterIntensity(str);
    }

    @Override // com.ss.android.vesdk.f.c
    public final int b(int[] iArr) {
        int removeFilter;
        MethodCollector.i(8789);
        synchronized (this.f150890a) {
            try {
                an.a("VEEditor_VEFilterInvoker", "deleteFilters...");
                removeFilter = this.f150891b.removeFilter(iArr);
            } finally {
                MethodCollector.o(8789);
            }
        }
        return removeFilter;
    }

    public ab(x xVar) {
        this.f150890a = xVar;
        TEInterface tEInterface = xVar.B;
        this.f150891b = tEInterface;
        this.f150892c = new TEAudioEffectInterface(tEInterface.getNativeHandler());
        this.f150900k = new h();
    }

    @Override // com.ss.android.vesdk.f.c
    public final int b(String str) {
        an.a("VEEditor_VEFilterInvoker", "setEffectHDRFilter filterPath=".concat(String.valueOf(str)));
        an.a("VEEditor_VEFilterInvoker", "setEffectHDRFilter filterPath=" + str + ", intensity=1.0");
        return c(str, 1.0f);
    }

    @Override // com.ss.android.vesdk.f.c
    public final int c(int[] iArr) {
        int removeFilter;
        MethodCollector.i(10402);
        synchronized (this.f150890a) {
            try {
                an.c("VEEditor_VEFilterInvoker", "deleteAudioFilter..." + iArr[0]);
                removeFilter = this.f150891b.removeFilter(iArr);
            } finally {
                MethodCollector.o(10402);
            }
        }
        return removeFilter;
    }

    @Override // com.ss.android.vesdk.f.c
    public final int e(int i2) {
        int i3;
        MethodCollector.i(10073);
        synchronized (this.f150890a) {
            try {
                h hVar = this.f150900k;
                int b2 = hVar.b();
                if (b2 == h.f151458c) {
                    VERepeatFilterParam vERepeatFilterParam = (VERepeatFilterParam) hVar.f151460e.f151477g;
                    i3 = vERepeatFilterParam.repeatDuration * (vERepeatFilterParam.repeatTime - 1);
                } else if (b2 == h.f151459d) {
                    VESlowMotionFilterParam vESlowMotionFilterParam = (VESlowMotionFilterParam) hVar.f151460e.f151477g;
                    i3 = ((int) (((float) vESlowMotionFilterParam.slowMotionDuration) / vESlowMotionFilterParam.slowMotionSpeed)) - vESlowMotionFilterParam.slowMotionDuration;
                }
                i2 -= i3;
            } finally {
                MethodCollector.o(10073);
            }
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    @Override // com.ss.android.vesdk.f.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(int r7) {
        /*
            r6 = this;
            com.ss.android.vesdk.runtime.h r5 = r6.f150900k
            int r4 = r5.b()
            int r0 = com.ss.android.vesdk.runtime.h.f151458c
            if (r4 != r0) goto L_0x001a
            com.ss.android.vesdk.runtime.h$b r0 = r5.f151460e
            com.ss.android.vesdk.filterparam.VEBaseFilterParam r3 = r0.f151477g
            com.ss.android.vesdk.filterparam.VERepeatFilterParam r3 = (com.ss.android.vesdk.filterparam.VERepeatFilterParam) r3
            int r2 = r3.seqIn
            int r1 = r3.repeatDuration
            int r0 = r3.repeatTime
            int r1 = r1 * r0
            int r1 = r1 + r2
            if (r7 >= r2) goto L_0x004e
        L_0x001a:
            r1 = r7
        L_0x001b:
            int r0 = com.ss.android.vesdk.runtime.h.f151459d
            if (r4 != r0) goto L_0x004c
            com.ss.android.vesdk.runtime.h$b r0 = r5.f151460e
            com.ss.android.vesdk.filterparam.VEBaseFilterParam r4 = r0.f151477g
            com.ss.android.vesdk.filterparam.VESlowMotionFilterParam r4 = (com.ss.android.vesdk.filterparam.VESlowMotionFilterParam) r4
            int r3 = r4.seqIn
            float r2 = (float) r3
            int r0 = r4.slowMotionDuration
            float r1 = (float) r0
            float r0 = r4.slowMotionSpeed
            float r1 = r1 / r0
            float r2 = r2 + r1
            int r0 = (int) r2
            if (r7 >= r3) goto L_0x0033
        L_0x0032:
            return r7
        L_0x0033:
            if (r7 < r3) goto L_0x003f
            if (r7 >= r0) goto L_0x003f
            int r7 = r7 - r3
            float r1 = (float) r7
            float r0 = r4.slowMotionSpeed
            float r1 = r1 * r0
            int r7 = (int) r1
            int r7 = r7 + r3
            goto L_0x0032
        L_0x003f:
            int r0 = r4.slowMotionDuration
            float r1 = (float) r0
            float r0 = r4.slowMotionSpeed
            float r1 = r1 / r0
            int r0 = r4.slowMotionDuration
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = (int) r1
            int r7 = r7 - r0
            goto L_0x0032
        L_0x004c:
            r7 = r1
            goto L_0x0032
        L_0x004e:
            if (r7 < r2) goto L_0x0059
            if (r7 >= r1) goto L_0x0059
            int r1 = r7 - r2
            int r0 = r3.repeatDuration
            int r1 = r1 % r0
            int r1 = r1 + r2
            goto L_0x001b
        L_0x0059:
            int r1 = r3.repeatDuration
            int r0 = r3.repeatTime
            int r0 = r0 + -1
            int r1 = r1 * r0
            int r1 = r7 - r1
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.ab.d(int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.ss.android.vesdk.f.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(int r6) {
        /*
            r5 = this;
            com.ss.android.vesdk.runtime.h r4 = r5.f150900k
            int r3 = r4.b()
            int r0 = com.ss.android.vesdk.runtime.h.f151458c
            if (r3 != r0) goto L_0x0017
            com.ss.android.vesdk.runtime.h$b r0 = r4.f151460e
            com.ss.android.vesdk.filterparam.VEBaseFilterParam r2 = r0.f151477g
            com.ss.android.vesdk.filterparam.VERepeatFilterParam r2 = (com.ss.android.vesdk.filterparam.VERepeatFilterParam) r2
            int r1 = r2.seqIn
            int r0 = r2.repeatDuration
            int r1 = r1 + r0
            if (r6 >= r1) goto L_0x0045
        L_0x0017:
            r1 = r6
        L_0x0018:
            int r0 = com.ss.android.vesdk.runtime.h.f151459d
            if (r3 != r0) goto L_0x0043
            com.ss.android.vesdk.runtime.h$b r0 = r4.f151460e
            com.ss.android.vesdk.filterparam.VEBaseFilterParam r3 = r0.f151477g
            com.ss.android.vesdk.filterparam.VESlowMotionFilterParam r3 = (com.ss.android.vesdk.filterparam.VESlowMotionFilterParam) r3
            int r2 = r3.seqIn
            int r0 = r3.slowMotionDuration
            int r0 = r0 + r2
            if (r6 >= r2) goto L_0x002a
        L_0x0029:
            return r6
        L_0x002a:
            if (r6 < r2) goto L_0x0036
            if (r6 >= r0) goto L_0x0036
            int r6 = r6 - r2
            float r1 = (float) r6
            float r0 = r3.slowMotionSpeed
            float r1 = r1 / r0
            int r6 = (int) r1
            int r6 = r6 + r2
            goto L_0x0029
        L_0x0036:
            int r0 = r3.slowMotionDuration
            float r1 = (float) r0
            float r0 = r3.slowMotionSpeed
            float r1 = r1 / r0
            int r0 = r3.slowMotionDuration
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = (int) r1
            int r6 = r6 + r0
            goto L_0x0029
        L_0x0043:
            r6 = r1
            goto L_0x0029
        L_0x0045:
            int r1 = r2.repeatDuration
            int r0 = r2.repeatTime
            int r0 = r0 + -1
            int r1 = r1 * r0
            int r1 = r1 + r6
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.ab.c(int):int");
    }

    @Override // com.ss.android.vesdk.f.c
    public final int b(int i2) {
        boolean z;
        MethodCollector.i(9585);
        synchronized (this.f150890a) {
            try {
                an.d(h.f151456a, "TimeEffect deleteTimeEffect...  filterIndexes: " + i2 + " audioFilterIndex:" + this.f150900k.f151460e.f151476f);
                an.d(h.f151456a, "deleteTimeEffect before getDuration =" + this.f150891b.getDuration());
                if (i2 < 0) {
                    return -1;
                }
                if (this.f150891b.getCurState() != -20000) {
                    z = true;
                    int stop = this.f150891b.stop();
                    if (!(stop == 0 || stop == -101)) {
                        an.a("VEEditor_VEFilterInvoker", "pauseSync failed, ret ".concat(String.valueOf(stop)));
                        MethodCollector.o(9585);
                        return -1;
                    }
                } else {
                    z = false;
                }
                int removeFilter = this.f150891b.removeFilter(new int[]{i2});
                if (this.f150890a.f151516e.f151436k == 1 && this.f150900k.f151460e.f151476f >= 0) {
                    removeFilter = this.f150891b.removeFilter(new int[]{this.f150900k.f151460e.f151476f});
                }
                this.f150890a.f151516e.f151434i = x.h.EDITOR_NORMAl_MODE.ordinal();
                if (this.f150900k.b() == h.f151457b) {
                    this.f150900k.a();
                } else {
                    ArrayList<VEClipParam> arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<VEClipParam> arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    h hVar = this.f150900k;
                    an.d(h.f151456a, "deleteTimeEffect  mTrack.videoClips=" + hVar.f151460e.f151471a.size() + "mTrack.videoTimeEffectClips=" + hVar.f151460e.f151473c.size() + "mTrack.audioClips=" + hVar.f151460e.f151472b.size() + "mTrack.audioTimeEffectClips=" + hVar.f151460e.f151474d.size());
                    if (hVar.f151460e.f151471a.size() > 0) {
                        h.a(hVar.f151460e.f151471a, hVar.f151460e.f151473c, arrayList, arrayList2);
                    }
                    if (hVar.f151460e.f151472b.size() > 0) {
                        h.a(hVar.f151460e.f151472b, hVar.f151460e.f151474d, arrayList3, arrayList4);
                    }
                    hVar.a();
                    an.d(h.f151456a, "deleteTimeEffect deleteVideoClip begin");
                    for (VEClipParam vEClipParam : arrayList) {
                        int deleteClip = this.f150891b.deleteClip(0, this.f150890a.A, vEClipParam.clipIndex);
                        if (deleteClip < 0) {
                            an.d(h.f151456a, "deleteTimeEffect deleteVideoClip failed, ret = ".concat(String.valueOf(deleteClip)));
                        }
                        an.b(h.f151456a, "deleteTimeEffect deleteVideoClip =" + vEClipParam.toString());
                    }
                    an.d(h.f151456a, "deleteTimeEffect deleteVideoClip end");
                    an.d(h.f151456a, "deleteTimeEffect updateVideoClip begin");
                    VEClipTimelineParam[] vEClipTimelineParamArr = new VEClipTimelineParam[arrayList2.size()];
                    int[] iArr = new int[arrayList2.size()];
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        vEClipTimelineParamArr[i3] = new VEClipTimelineParam();
                        vEClipTimelineParamArr[i3].trimIn = ((VEClipParam) arrayList2.get(i3)).trimIn;
                        vEClipTimelineParamArr[i3].trimOut = ((VEClipParam) arrayList2.get(i3)).trimOut;
                        vEClipTimelineParamArr[i3].speed = ((VEClipParam) arrayList2.get(i3)).speed;
                        iArr[i3] = ((VEClipParam) arrayList2.get(i3)).clipIndex;
                        an.d(h.f151456a, "deleteTimeEffect updateVideoClip =" + ((VEClipParam) arrayList2.get(i3)).toString());
                    }
                    int updateClipsTimelineParam = this.f150891b.updateClipsTimelineParam(0, this.f150890a.A, iArr, vEClipTimelineParamArr);
                    if (updateClipsTimelineParam < 0) {
                        an.d(h.f151456a, "deleteTimeEffect updateClipsTimelineParam failed, ret = ".concat(String.valueOf(updateClipsTimelineParam)));
                    }
                    an.d(h.f151456a, "deleteTimeEffect updateVideoClip end");
                    if (this.f150890a.f151516e.f151436k == 1 && (arrayList3.size() > 0 || arrayList4.size() > 0)) {
                        an.d(h.f151456a, "deleteTimeEffect deleteAuidoClip begin");
                        for (VEClipParam vEClipParam2 : arrayList3) {
                            int deleteClip2 = this.f150891b.deleteClip(1, this.f150890a.f151516e.f151435j, vEClipParam2.clipIndex);
                            if (deleteClip2 < 0) {
                                an.d(h.f151456a, "deleteTimeEffect deleteAuidoClip failed, ret = ".concat(String.valueOf(deleteClip2)));
                            }
                            an.b(h.f151456a, "deleteTimeEffect deleteAuidoClip =" + vEClipParam2.toString());
                        }
                        an.d(h.f151456a, "deleteTimeEffect deleteAuidoClip end");
                        an.d(h.f151456a, "deleteTimeEffect updateAudioClip begin");
                        VEClipTimelineParam[] vEClipTimelineParamArr2 = new VEClipTimelineParam[arrayList4.size()];
                        int[] iArr2 = new int[arrayList4.size()];
                        for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                            vEClipTimelineParamArr2[i4] = new VEClipTimelineParam();
                            vEClipTimelineParamArr2[i4].trimIn = ((VEClipParam) arrayList4.get(i4)).trimIn;
                            vEClipTimelineParamArr2[i4].trimOut = ((VEClipParam) arrayList4.get(i4)).trimOut;
                            vEClipTimelineParamArr2[i4].speed = ((VEClipParam) arrayList4.get(i4)).speed;
                            iArr2[i4] = ((VEClipParam) arrayList4.get(i4)).clipIndex;
                            an.d(h.f151456a, "deleteTimeEffect updateAudioClip =" + ((VEClipParam) arrayList4.get(i4)).toString());
                        }
                        int updateClipsTimelineParam2 = this.f150891b.updateClipsTimelineParam(1, this.f150890a.f151516e.f151435j, iArr, vEClipTimelineParamArr2);
                        if (updateClipsTimelineParam2 < 0) {
                            an.d(h.f151456a, "deleteTimeEffect updateClipsTimelineParam failed, ret = ".concat(String.valueOf(updateClipsTimelineParam2)));
                        }
                        an.d(h.f151456a, "deleteTimeEffect updateAudioClip end");
                    }
                    an.d(h.f151456a, "deleteTimeEffect after getDuration =" + this.f150891b.getDuration());
                }
                TEInterface tEInterface = this.f150891b;
                tEInterface.setTimeRange(0, tEInterface.getDuration(), 1);
                this.f150890a.ac.f61225c = 0;
                if (z) {
                    this.f150891b.createTimeline();
                    this.f150891b.prepareEngine(0);
                }
                MethodCollector.o(9585);
                return removeFilter;
            } finally {
                MethodCollector.o(9585);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.c
    public final int a(String str, float f2) {
        return a(str, f2, false);
    }

    @Override // com.ss.android.vesdk.f.c
    public final int a(int i2, int i3) {
        an.c("VEEditor_VEFilterInvoker", "disableAudioEffect... filterIndex " + i2 + ", outPoint " + i3);
        if (i2 == -1) {
            return -100;
        }
        return this.f150891b.adjustFilterInOut(i2, -1, i3);
    }

    private int c(String str, float f2) {
        int i2;
        MethodCollector.i(9202);
        synchronized (this.f150890a) {
            try {
                an.a("VEEditor_VEFilterInvoker", "setEffectHDRFilter type=1, filterPath=" + str + ", intensity=1.0");
                int i3 = this.f150895f;
                if (i3 < 0) {
                    return -105;
                }
                if (str == null) {
                    str = "";
                    f2 = 0.0f;
                }
                this.f150891b.setFilterParam(i3, "effect hdr type", "1");
                this.f150891b.setFilterParam(this.f150895f, "effect hdr res path", str);
                this.f150891b.setFilterParam(this.f150895f, "effect hdr intensity", String.valueOf(f2));
                if (str.length() > 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                e.a("iesve_veeditor_set_effect_hdr", i2, (a) null);
                MethodCollector.o(9202);
                return 0;
            } finally {
                MethodCollector.o(9202);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.c
    public final int b(String str, float f2) {
        MethodCollector.i(8993);
        an.a("VEEditor_VEFilterInvoker", "setColorFilterNew normal...");
        synchronized (this.f150890a) {
            try {
                if (this.f150893d < 0) {
                    an.d("VEEditor_VEFilterInvoker", "setColorFilterNew... mColorFilterIndex error.");
                    return -105;
                } else if (str == null) {
                    an.d("VEEditor_VEFilterInvoker", "setColorFilterNew... param error.");
                    MethodCollector.o(8993);
                    return -100;
                } else {
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    } else if (f2 < 0.0f) {
                        f2 = -1.0f;
                    }
                    if (this.f150899j == null) {
                        this.f150899j = new com.ss.android.ttve.model.c();
                    }
                    if (str.equals(this.f150899j.f61171a) && this.f150899j.f61172b.length() == 0 && this.f150899j.f61174d == f2 && this.f150899j.f61173c == 1.0f) {
                        MethodCollector.o(8993);
                        return 0;
                    }
                    this.f150899j.f61171a = str;
                    this.f150899j.f61172b = "";
                    this.f150899j.f61173c = 1.0f;
                    this.f150899j.f61174d = f2;
                    this.f150899j.f61175e = f2;
                    this.f150899j.f61176f = false;
                    this.f150899j.f61177g = true;
                    this.f150891b.setFilterParam(this.f150893d, "left filter", str);
                    this.f150891b.setFilterParam(this.f150893d, "left filter intensity", String.valueOf(f2));
                    this.f150891b.setFilterParam(this.f150893d, "right filter", "");
                    this.f150891b.setFilterParam(this.f150893d, "filter position", "1.0");
                    this.f150891b.setFilterParam(this.f150893d, "filter use v3", "true");
                    a aVar = new a();
                    String str2 = "";
                    if (!TextUtils.isEmpty(str)) {
                        String[] split = str.split(File.separator);
                        if (split.length > 0) {
                            str2 = split[split.length - 1];
                        }
                    }
                    aVar.a("iesve_veeditor_set_filter_click_filter_id", str2);
                    e.a("iesve_veeditor_set_filter_click", 1, aVar);
                    com.ss.android.ttve.monitor.h.a(1, "te_composition_filter_id", str);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("filterPath", str);
                        jSONObject.put("intensity", String.valueOf(f2));
                        jSONObject.put("tag", "setColorFilterNew");
                        b.a("vesdk_event_editor_color_filter", jSONObject, "behavior");
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    MethodCollector.o(8993);
                    return 0;
                }
            } finally {
                MethodCollector.o(8993);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.c
    public final int a(int i2, VEBaseFilterParam vEBaseFilterParam) {
        int i3;
        MethodCollector.i(8986);
        synchronized (this.f150890a) {
            try {
                an.a("VEEditor_VEFilterInvoker", "updateTrackFilterParam, filterIndex: " + i2 + ", param = " + vEBaseFilterParam.toString());
                int i4 = -1;
                if (vEBaseFilterParam.filterType == 1) {
                    TEAudioEffectInterface tEAudioEffectInterface = this.f150892c;
                    if (tEAudioEffectInterface == null) {
                        an.d("VEEditor_VEFilterInvoker", "DON'T SUPPORT AUDIO EFFECT!");
                        return -1;
                    }
                    i3 = tEAudioEffectInterface.updateAudioFilterParam(-1, i2, vEBaseFilterParam);
                } else {
                    i3 = this.f150891b.updateFilterParam(-1, i2, vEBaseFilterParam);
                }
                if (i3 >= 0) {
                    i4 = 0;
                }
                MethodCollector.o(8986);
                return i4;
            } finally {
                MethodCollector.o(8986);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.c
    public final int a(int i2, int i3, VEBaseFilterParam vEBaseFilterParam) {
        return a(i2, i3, vEBaseFilterParam, 0, this.f150890a.P);
    }

    @Override // com.ss.android.vesdk.f.c
    public final int a(int i2, int i3, int i4) {
        an.a("VEEditor_VEFilterInvoker", "updateTrackFilterTime, filterIndex: " + i2 + ", sequenceIn: " + i3 + ", sequenceOut: " + i4);
        return this.f150891b.updateFilterTime(-1, i2, i3, i4);
    }

    @Override // com.ss.android.vesdk.f.c
    public final int b(int i2, int i3, VEBaseFilterParam vEBaseFilterParam) {
        int i4;
        MethodCollector.i(8794);
        synchronized (this.f150890a) {
            try {
                an.b("VEEditor_VEFilterInvoker", "updateClipFilterParam, clipIndex:" + i2 + ",filterIndex:" + i3);
                int i5 = -1;
                if (vEBaseFilterParam.filterType == 1) {
                    TEAudioEffectInterface tEAudioEffectInterface = this.f150892c;
                    if (tEAudioEffectInterface == null) {
                        an.d("VEEditor_VEFilterInvoker", "DON'T SUPPORT AUDIO EFFECT!");
                        return -1;
                    }
                    i4 = tEAudioEffectInterface.updateAudioFilterParam(i2, i3, vEBaseFilterParam);
                } else {
                    i4 = this.f150891b.updateFilterParam(i2, i3, vEBaseFilterParam);
                }
                if (i4 >= 0) {
                    i5 = 0;
                }
                MethodCollector.o(8794);
                return i5;
            } finally {
                MethodCollector.o(8794);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.c
    public final int c(int i2, int i3, VEBaseFilterParam vEBaseFilterParam) {
        boolean z;
        int i4;
        float f2;
        SparseArray sparseArray;
        MethodCollector.i(9581);
        synchronized (this.f150890a) {
            try {
                if (vEBaseFilterParam instanceof VERepeatFilterParam) {
                    VERepeatFilterParam vERepeatFilterParam = (VERepeatFilterParam) vEBaseFilterParam;
                    if (vERepeatFilterParam.seqIn + vERepeatFilterParam.repeatDuration > this.f150891b.getDuration()) {
                        an.d("VEEditor_VEFilterInvoker", "(repeatFilterParam.seqIn + repeatFilterParam.repeatDuration) > mNativeEditor.getDuration() error");
                        MethodCollector.o(9581);
                        return -1;
                    }
                } else if (vEBaseFilterParam instanceof VESlowMotionFilterParam) {
                    VESlowMotionFilterParam vESlowMotionFilterParam = (VESlowMotionFilterParam) vEBaseFilterParam;
                    if (vESlowMotionFilterParam.seqIn + vESlowMotionFilterParam.slowMotionDuration > this.f150891b.getDuration()) {
                        an.d("VEEditor_VEFilterInvoker", "((slowFilterParam.seqIn + slowFilterParam.slowMotionDuration) > mNativeEditor.getDuration() error");
                        MethodCollector.o(9581);
                        return -1;
                    }
                }
                TEVideoUtils.nativeCancelCompileProbe();
                if (this.f150891b.getCurState() != -20000) {
                    z = true;
                    i4 = this.f150891b.stop();
                    if (!(i4 == 0 || i4 == -101)) {
                        an.d("VEEditor_VEFilterInvoker", "stopSync failed in addTimeEffect, ret=" + i4 + ", for filtername=" + vEBaseFilterParam.filterName);
                        MethodCollector.o(9581);
                        return -1;
                    }
                } else {
                    z = false;
                    i4 = 0;
                }
                int[] iArr = {-1};
                int[] iArr2 = {-1};
                int duration = this.f150891b.getDuration();
                if (vEBaseFilterParam.filterType == 25) {
                    if (vEBaseFilterParam instanceof VERepeatFilterParam) {
                        VERepeatFilterParam vERepeatFilterParam2 = (VERepeatFilterParam) vEBaseFilterParam;
                        iArr = this.f150891b.addFilters(new int[]{0}, new String[]{vERepeatFilterParam2.filterName}, new int[]{0}, new int[]{duration}, new int[]{0}, new int[]{25}, new int[]{vERepeatFilterParam2.filterDurationType});
                        this.f150890a.f151516e.f151434i = vERepeatFilterParam2.timeMode;
                        this.f150891b.setFilterParam(iArr[0], "timeEffect seqin", new StringBuilder().append(vERepeatFilterParam2.seqIn).toString());
                        this.f150891b.setFilterParam(iArr[0], "timeEffect repeating duration", new StringBuilder().append(vERepeatFilterParam2.repeatDuration).toString());
                        this.f150891b.setFilterParam(iArr[0], "timeEffect repeating times", new StringBuilder().append(vERepeatFilterParam2.repeatTime).toString());
                        this.f150891b.setFilterParam(iArr[0], "timeEffect repeating mode", new StringBuilder().append(vERepeatFilterParam2.timeMode).toString());
                        if (this.f150890a.f151516e.f151436k == 1) {
                            iArr2 = this.f150891b.addFilters(new int[]{this.f150890a.f151516e.f151435j}, new String[]{vERepeatFilterParam2.filterName}, new int[]{0}, new int[]{duration}, new int[]{1}, new int[]{25}, new int[]{vERepeatFilterParam2.filterDurationType});
                            this.f150891b.setFilterParam(iArr2[0], "timeEffect seqin", new StringBuilder().append(vERepeatFilterParam2.seqIn).toString());
                            this.f150891b.setFilterParam(iArr2[0], "timeEffect repeating duration", new StringBuilder().append(vERepeatFilterParam2.repeatDuration).toString());
                            this.f150891b.setFilterParam(iArr2[0], "timeEffect repeating times", new StringBuilder().append(vERepeatFilterParam2.repeatTime).toString());
                            this.f150891b.setFilterParam(iArr2[0], "timeEffect repeating mode", new StringBuilder().append(vERepeatFilterParam2.timeMode).toString());
                        }
                        an.d(h.f151456a, "TimeEffect addRepeatEffect...  trackIndex:0" + " trackType:0" + " filterIndex:" + iArr[0] + " audioFilterIndex:" + iArr2[0] + " seqIn:" + vERepeatFilterParam2.seqIn + " seqOut:" + vERepeatFilterParam2.seqOut + " repeatDuration:" + vERepeatFilterParam2.repeatDuration + " repeatTime:" + vERepeatFilterParam2.repeatTime + " timeMode:" + vERepeatFilterParam2.timeMode);
                        a aVar = new a();
                        aVar.a("iesve_veeditor_time_effect_id", "repeat");
                        e.a("iesve_veeditor_time_effect", 1, aVar);
                        this.f150890a.ac.f61225c = 1;
                    } else if (vEBaseFilterParam instanceof VESlowMotionFilterParam) {
                        VESlowMotionFilterParam vESlowMotionFilterParam2 = (VESlowMotionFilterParam) vEBaseFilterParam;
                        iArr = this.f150891b.addFilters(new int[]{0}, new String[]{vESlowMotionFilterParam2.filterName}, new int[]{0}, new int[]{duration}, new int[]{0}, new int[]{25}, new int[]{vESlowMotionFilterParam2.filterDurationType});
                        this.f150890a.f151516e.f151434i = vESlowMotionFilterParam2.timeMode;
                        this.f150891b.setFilterParam(iArr[0], "timeEffect seqin", new StringBuilder().append(vESlowMotionFilterParam2.seqIn).toString());
                        this.f150891b.setFilterParam(iArr[0], "timeEffect slow motion duration", new StringBuilder().append(vESlowMotionFilterParam2.slowMotionDuration).toString());
                        this.f150891b.setFilterParam(iArr[0], "timeEffect slow motion speed", new StringBuilder().append(vESlowMotionFilterParam2.slowMotionSpeed).toString());
                        this.f150891b.setFilterParam(iArr[0], "timeEffect slow motion mode", new StringBuilder().append(vESlowMotionFilterParam2.timeMode).toString());
                        if (this.f150890a.f151516e.f151436k == 1) {
                            iArr2 = this.f150891b.addFilters(new int[]{this.f150890a.f151516e.f151435j}, new String[]{vESlowMotionFilterParam2.filterName}, new int[]{0}, new int[]{duration}, new int[]{1}, new int[]{25}, new int[]{vESlowMotionFilterParam2.filterDurationType});
                            this.f150891b.setFilterParam(iArr2[0], "timeEffect seqin", new StringBuilder().append(vESlowMotionFilterParam2.seqIn).toString());
                            this.f150891b.setFilterParam(iArr2[0], "timeEffect slow motion duration", new StringBuilder().append(vESlowMotionFilterParam2.slowMotionDuration).toString());
                            this.f150891b.setFilterParam(iArr2[0], "timeEffect slow motion speed", new StringBuilder().append(vESlowMotionFilterParam2.slowMotionSpeed).toString());
                            this.f150891b.setFilterParam(iArr2[0], "timeEffect slow motion mode", new StringBuilder().append(vESlowMotionFilterParam2.timeMode).toString());
                        }
                        an.b(h.f151456a, "TimeEffect addRepeatEffect...  trackIndex:0" + " trackType:0" + " filterIndex:" + iArr[0] + " audioFilterIndex:" + iArr2[0] + " seqIn:" + vESlowMotionFilterParam2.seqIn + " seqOut:" + vESlowMotionFilterParam2.seqOut + " slowMotionDuration:" + vESlowMotionFilterParam2.slowMotionDuration + " slowMotionSpeed:" + vESlowMotionFilterParam2.slowMotionSpeed + " timeMode:" + vESlowMotionFilterParam2.timeMode);
                        a aVar2 = new a();
                        aVar2.a("iesve_veeditor_time_effect_id", "slow");
                        e.a("iesve_veeditor_time_effect", 1, aVar2);
                        this.f150890a.ac.f61225c = 2;
                    }
                }
                ArrayList<VEClipParam> arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<VEClipParam> arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                x xVar = this.f150890a;
                List<VEClipParam> g2 = xVar.g(0, xVar.A);
                ArrayList arrayList5 = new ArrayList();
                if (this.f150890a.f151516e.f151436k == 1) {
                    x xVar2 = this.f150890a;
                    arrayList5.addAll(xVar2.g(1, xVar2.f151516e.f151435j));
                    f2 = this.f150891b.getTrackVolume(1, this.f150890a.f151516e.f151435j, 0);
                } else {
                    f2 = 0.0f;
                }
                float trackVolume = this.f150891b.getTrackVolume(0, this.f150890a.A, 0);
                an.d(h.f151456a, "addTimeEffect mOriginalSoundTrackType=" + this.f150890a.f151516e.f151436k + " mOriginalSoundTrackIndex=" + this.f150890a.f151516e.f151435j + " originalAudio.size=" + arrayList5.size() + " videoVolume=" + trackVolume + " audioVolume=" + f2);
                this.f150900k.a(iArr[0], iArr2[0], g2, arrayList5, vEBaseFilterParam, arrayList, arrayList2, arrayList3, arrayList4);
                for (VEClipParam vEClipParam : arrayList) {
                    VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                    vEClipSourceParam.clipFilePath = vEClipParam.path;
                    vEClipSourceParam.sourceType = 0;
                    VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                    vEClipTimelineParam.trimIn = vEClipParam.trimIn;
                    vEClipTimelineParam.trimOut = vEClipParam.trimOut;
                    vEClipTimelineParam.speed = vEClipParam.speed;
                    an.a(h.f151456a, "addTimeEffect insertVideoClip =" + vEClipParam.toString());
                    int insertClip = this.f150891b.insertClip(0, this.f150890a.A, vEClipParam.clipIndex, vEClipSourceParam, vEClipTimelineParam);
                    if (insertClip < 0) {
                        an.d(h.f151456a, "addTimeEffect insertVideoClip failed, ret = " + insertClip + " clipParam=" + vEClipParam.toString());
                    }
                }
                VEClipTimelineParam[] vEClipTimelineParamArr = new VEClipTimelineParam[arrayList2.size()];
                int[] iArr3 = new int[arrayList2.size()];
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    vEClipTimelineParamArr[i5] = new VEClipTimelineParam();
                    vEClipTimelineParamArr[i5].trimIn = ((VEClipParam) arrayList2.get(i5)).trimIn;
                    vEClipTimelineParamArr[i5].trimOut = ((VEClipParam) arrayList2.get(i5)).trimOut;
                    vEClipTimelineParamArr[i5].speed = ((VEClipParam) arrayList2.get(i5)).speed;
                    iArr3[i5] = ((VEClipParam) arrayList2.get(i5)).clipIndex;
                    this.f150891b.setClipAttr(0, this.f150890a.A, iArr3[i5], "clip rotate", new StringBuilder().append(((VEClipParam) arrayList2.get(i5)).clipRotate).toString());
                    an.a(h.f151456a, "addTimeEffect updateVideoClip =" + ((VEClipParam) arrayList2.get(i5)).toString());
                }
                int updateClipsTimelineParam = this.f150891b.updateClipsTimelineParam(0, this.f150890a.A, iArr3, vEClipTimelineParamArr);
                if (i4 < 0) {
                    an.d(h.f151456a, "addTimeEffect updateClipsTimelineParam failed, ret = ".concat(String.valueOf(updateClipsTimelineParam)));
                }
                if (this.f150890a.f151516e.f151436k == 1 && arrayList5.size() > 0) {
                    for (VEClipParam vEClipParam2 : arrayList3) {
                        VEClipSourceParam vEClipSourceParam2 = new VEClipSourceParam();
                        vEClipSourceParam2.clipFilePath = vEClipParam2.path;
                        vEClipSourceParam2.sourceType = 0;
                        VEClipTimelineParam vEClipTimelineParam2 = new VEClipTimelineParam();
                        vEClipTimelineParam2.trimIn = vEClipParam2.trimIn;
                        vEClipTimelineParam2.trimOut = vEClipParam2.trimOut;
                        vEClipTimelineParam2.speed = vEClipParam2.speed;
                        an.a(h.f151456a, "addTimeEffect insertAudioClip =" + vEClipParam2.toString());
                        int insertClip2 = this.f150891b.insertClip(1, this.f150890a.f151516e.f151435j, vEClipParam2.clipIndex, vEClipSourceParam2, vEClipTimelineParam2);
                        if (insertClip2 < 0) {
                            an.d(h.f151456a, "addTimeEffect insertAudioClip failed, ret = " + insertClip2 + " clipParam=" + vEClipParam2.toString());
                        }
                    }
                    VEClipTimelineParam[] vEClipTimelineParamArr2 = new VEClipTimelineParam[arrayList4.size()];
                    int[] iArr4 = new int[arrayList4.size()];
                    for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                        vEClipTimelineParamArr2[i6] = new VEClipTimelineParam();
                        vEClipTimelineParamArr2[i6].trimIn = ((VEClipParam) arrayList4.get(i6)).trimIn;
                        vEClipTimelineParamArr2[i6].trimOut = ((VEClipParam) arrayList4.get(i6)).trimOut;
                        vEClipTimelineParamArr2[i6].speed = ((VEClipParam) arrayList4.get(i6)).speed;
                        iArr4[i6] = ((VEClipParam) arrayList4.get(i6)).clipIndex;
                        an.a(h.f151456a, "addTimeEffect updateAudioClip =" + ((VEClipParam) arrayList4.get(i6)).toString());
                    }
                    int updateClipsTimelineParam2 = this.f150891b.updateClipsTimelineParam(1, this.f150890a.f151516e.f151435j, iArr4, vEClipTimelineParamArr2);
                    if (updateClipsTimelineParam2 < 0) {
                        an.d(h.f151456a, "addTimeEffect updateAudioClip failed, ret = ".concat(String.valueOf(updateClipsTimelineParam2)));
                    }
                }
                if (this.f150890a.f151516e.f151435j > 0) {
                    sparseArray = new SparseArray();
                } else {
                    sparseArray = null;
                }
                for (int i7 = 0; i7 < this.f150890a.f151516e.f151435j; i7++) {
                    sparseArray.put(i7, Float.valueOf(this.f150890a.h(i7)));
                }
                this.f150891b.setTrackVolume(0, this.f150890a.A, trackVolume);
                if (this.f150890a.f151516e.f151436k == 1) {
                    this.f150891b.setTrackVolume(1, this.f150890a.f151516e.f151435j, f2);
                }
                for (int i8 = 0; i8 < this.f150890a.f151516e.f151435j; i8++) {
                    this.f150891b.setTrackVolume(1, i8, ((Float) sparseArray.get(i8)).floatValue());
                }
                TEInterface tEInterface = this.f150891b;
                tEInterface.setTimeRange(0, tEInterface.getDuration(), 1);
                if (z) {
                    this.f150891b.createTimeline();
                    this.f150891b.prepareEngine(0);
                }
                return iArr[0];
            } finally {
                MethodCollector.o(9581);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        if (r2 == 0) goto L_0x00b0;
     */
    @Override // com.ss.android.vesdk.f.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r23, int r24, com.ss.android.vesdk.filterparam.VEBaseFilterParam r25, int r26, int r27) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.ab.a(int, int, com.ss.android.vesdk.filterparam.VEBaseFilterParam, int, int):int");
    }

    @Override // com.ss.android.vesdk.f.c
    public final int a(int i2, int i3, String str, byte[] bArr, int i4, VEListener.a aVar) {
        int i5;
        MethodCollector.i(10240);
        an.a("VEEditor_VEFilterInvoker", "enableAudioCommonFilter...");
        TEVideoUtils.nativeCancelCompileProbe();
        int duration = this.f150891b.getDuration();
        j jVar = this.f150890a.s;
        if (i2 == 1) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        int a2 = jVar.a(i5, i3);
        if (str.equals("")) {
            int[] addFilters = this.f150891b.addFilters(new int[]{a2}, new String[]{"audio original filter"}, new int[]{i4}, new int[]{duration}, new int[]{i2}, new int[]{1});
            an.d("VEEditor_VEFilterInvoker", "audio original filter " + addFilters[0] + " seqIn: " + i4);
            if (addFilters[0] < 0) {
                an.d("VEEditor_VEFilterInvoker", "Add filter failed!");
                MethodCollector.o(10240);
                return -1;
            }
            an.a("VEEditor_VEFilterInvoker", "enableAudioOriginalFilter...filterIndex = " + addFilters[0] + ", seqIn = " + i4);
            int i6 = addFilters[0];
            MethodCollector.o(10240);
            return i6;
        }
        int[] addFilters2 = this.f150891b.addFilters(new int[]{a2}, new String[]{"audio common filter"}, new int[]{i4}, new int[]{duration}, new int[]{i2}, new int[]{1});
        if (addFilters2[0] < 0) {
            an.d("VEEditor_VEFilterInvoker", "Add filter failed!");
            MethodCollector.o(10240);
            return -1;
        }
        long[] jArr = new long[1];
        int preprocessAudioTrackForFilter = this.f150891b.preprocessAudioTrackForFilter(i2, a2, str, bArr, jArr);
        byte[] audioCommonFilterPreprocessResult = this.f150891b.getAudioCommonFilterPreprocessResult(jArr[0]);
        if (aVar != null) {
            aVar.a(str, preprocessAudioTrackForFilter, audioCommonFilterPreprocessResult);
        }
        if (preprocessAudioTrackForFilter != 0) {
            an.d("VEEditor_VEFilterInvoker", "Add filter preprocess failed!");
            MethodCollector.o(10240);
            return -1;
        }
        this.f150891b.setFilterParam(addFilters2[0], "audio_common_filter_params", str);
        this.f150891b.setFilterParam(addFilters2[0], "audio_common_filter_preresult", audioCommonFilterPreprocessResult);
        an.a("VEEditor_VEFilterInvoker", "enableAudioCommonFilter...filterIndex " + addFilters2[0] + ", seqIn = " + i4);
        int i7 = addFilters2[0];
        MethodCollector.o(10240);
        return i7;
    }

    @Override // com.ss.android.vesdk.f.c
    public final int a(int i2, int i3, String str, byte[] bArr, int i4, int i5, VEListener.a aVar) {
        int i6;
        MethodCollector.i(10076);
        if (TextUtils.isEmpty(str)) {
            an.d("VEEditor_VEFilterInvoker", "addAudioCommonFilter failed path is null or path not exist");
            MethodCollector.o(10076);
            return -205;
        }
        an.a("VEEditor_VEFilterInvoker", "addAudioCommonFilter... trackType = " + i2 + ", trackIndex = " + i3);
        TEVideoUtils.nativeCancelCompileProbe();
        j jVar = this.f150890a.s;
        if (i2 == 1) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        int a2 = jVar.a(i6, i3);
        int[] addFilters = this.f150891b.addFilters(new int[]{a2}, new String[]{"audio common filter"}, new int[]{i4}, new int[]{i5}, new int[]{i2}, new int[]{1});
        if (addFilters[0] < 0) {
            an.d("VEEditor_VEFilterInvoker", "Add filter failed!");
            MethodCollector.o(10076);
            return -1;
        }
        long[] jArr = new long[1];
        int preprocessAudioTrackForFilter = this.f150891b.preprocessAudioTrackForFilter(i2, a2, str, bArr, jArr);
        byte[] audioCommonFilterPreprocessResult = this.f150891b.getAudioCommonFilterPreprocessResult(jArr[0]);
        if (aVar != null) {
            aVar.a(str, preprocessAudioTrackForFilter, audioCommonFilterPreprocessResult);
        }
        if (preprocessAudioTrackForFilter != 0) {
            an.d("VEEditor_VEFilterInvoker", "Add filter preprocess failed!");
            MethodCollector.o(10076);
            return -1;
        }
        this.f150891b.setFilterParam(addFilters[0], "audio_common_filter_params", str);
        this.f150891b.setFilterParam(addFilters[0], "audio_common_filter_preresult", audioCommonFilterPreprocessResult);
        int i7 = addFilters[0];
        MethodCollector.o(10076);
        return i7;
    }
}
