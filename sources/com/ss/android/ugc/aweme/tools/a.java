package com.ss.android.ugc.aweme.tools;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.a.f;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f138734a = R.anim.f354do;

    /* renamed from: b  reason: collision with root package name */
    public static final int f138735b = R.anim.dx;

    /* renamed from: c  reason: collision with root package name */
    public static final int f138736c = R.anim.dq;

    /* renamed from: d  reason: collision with root package name */
    public static final int f138737d = R.anim.dv;

    /* renamed from: e  reason: collision with root package name */
    public static final int f138738e = R.anim.dp;

    /* renamed from: f  reason: collision with root package name */
    public static final int f138739f = R.anim.dy;

    /* renamed from: g  reason: collision with root package name */
    public static final int f138740g = R.anim.dr;

    /* renamed from: h  reason: collision with root package name */
    public static final int f138741h = R.anim.dw;

    /* renamed from: i  reason: collision with root package name */
    public static final int f138742i = R.anim.w;

    /* renamed from: j  reason: collision with root package name */
    public static final int f138743j = R.anim.x;

    /* renamed from: k  reason: collision with root package name */
    public static final int f138744k = R.anim.bj;

    /* renamed from: l  reason: collision with root package name */
    public static final int f138745l = R.anim.bk;

    /* renamed from: m  reason: collision with root package name */
    public static final int f138746m = R.anim.dn;
    public static final int n = R.anim.du;
    public static final int o = R.anim.e9;

    static {
        Covode.recordClassIndex(90750);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(Activity activity, int i2) {
        int i3;
        int i4 = 0;
        switch (i2) {
            case 0:
                i4 = f138736c;
                i3 = f138737d;
                break;
            case 1:
                i3 = 0;
                break;
            case 2:
                i4 = f138740g;
                i3 = f138741h;
                break;
            case 3:
                i4 = f138742i;
                i3 = 0;
                break;
            case 4:
                i4 = f138734a;
                i3 = f138735b;
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            default:
                i4 = f138736c;
                i3 = f138737d;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                i4 = f138734a;
                i3 = 0;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                i4 = f138742i;
                i3 = f138745l;
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                i4 = f138742i;
                i3 = n;
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                i4 = f138742i;
                i3 = o;
                break;
        }
        if (activity instanceof f) {
            ((f) activity).a(i4, i3);
        } else {
            activity.overridePendingTransition(i4, i3);
        }
    }

    public static void b(Activity activity, int i2) {
        int i3;
        int i4 = 0;
        switch (i2) {
            case 0:
                i4 = f138734a;
                i3 = f138735b;
                break;
            case 1:
                i3 = 0;
                break;
            case 2:
                i4 = f138738e;
                i3 = f138739f;
                break;
            case 3:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                i3 = f138743j;
                break;
            case 4:
                i4 = f138736c;
                i3 = f138737d;
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                i3 = f138737d;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            default:
                i4 = f138734a;
                i3 = f138735b;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                i4 = f138744k;
                i3 = f138743j;
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                i4 = f138746m;
                i3 = f138743j;
                break;
        }
        activity.overridePendingTransition(i4, i3);
    }
}
