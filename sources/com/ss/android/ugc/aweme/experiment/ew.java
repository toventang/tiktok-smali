package com.ss.android.ugc.aweme.experiment;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;

public final class ew {

    /* renamed from: a  reason: collision with root package name */
    public static final ff f90000a = new ff();

    /* renamed from: b  reason: collision with root package name */
    public static final ew f90001b = new ew();

    private ew() {
    }

    static {
        Covode.recordClassIndex(56488);
    }

    private static ff g() {
        return (ff) b.a().a(true, "permission_popup_style_config", ff.class, f90000a);
    }

    public static String a() {
        ff g2;
        String str;
        String str2;
        String str3 = null;
        if (g() == null || (g2 = g()) == null || g2.f90034d == null) {
            return null;
        }
        ff g3 = g();
        if (g3 != null) {
            str = g3.f90034d;
        } else {
            str = null;
        }
        if (p.a(str, "Social_permissionPopup_main_con2", false)) {
            return d.a().getString(R.string.gd);
        }
        ff g4 = g();
        if (g4 != null) {
            str2 = g4.f90034d;
        } else {
            str2 = null;
        }
        if (a(str2) == 0) {
            return null;
        }
        Context a2 = d.a();
        ff g5 = g();
        if (g5 != null) {
            str3 = g5.f90034d;
        }
        return a2.getString(a(str3));
    }

    public static String b() {
        ff g2;
        String str;
        String str2;
        String str3 = null;
        if (g() == null || (g2 = g()) == null || g2.f90033c == null) {
            return null;
        }
        ff g3 = g();
        if (g3 != null) {
            str = g3.f90033c;
        } else {
            str = null;
        }
        if (p.a(str, "Social_permissionPopup_main_FB1", false)) {
            return d.a().getString(R.string.gc);
        }
        ff g4 = g();
        if (g4 != null) {
            str2 = g4.f90033c;
        } else {
            str2 = null;
        }
        if (a(str2) == 0) {
            return null;
        }
        Context a2 = d.a();
        ff g5 = g();
        if (g5 != null) {
            str3 = g5.f90033c;
        }
        return a2.getString(a(str3));
    }

    public static String c() {
        String str;
        String str2;
        if (g() != null) {
            ff g2 = g();
            String str3 = null;
            if (!(g2 == null || g2.f90035e == null)) {
                ff g3 = g();
                if (g3 != null) {
                    str2 = g3.f90035e;
                } else {
                    str2 = null;
                }
                if (a(str2) != 0) {
                    Context a2 = d.a();
                    ff g4 = g();
                    if (g4 != null) {
                        str3 = g4.f90035e;
                    }
                    str = a2.getString(a(str3));
                    l.b(str, "");
                    return str;
                }
            }
        }
        str = d.a().getString(R.string.mq);
        l.b(str, "");
        return str;
    }

    public static String d() {
        String str;
        String str2;
        if (g() != null) {
            ff g2 = g();
            String str3 = null;
            if (!(g2 == null || g2.f90036f == null)) {
                ff g3 = g();
                if (g3 != null) {
                    str2 = g3.f90036f;
                } else {
                    str2 = null;
                }
                if (a(str2) != 0) {
                    Context a2 = d.a();
                    ff g4 = g();
                    if (g4 != null) {
                        str3 = g4.f90036f;
                    }
                    str = a2.getString(a(str3));
                    l.b(str, "");
                    return str;
                }
            }
        }
        str = d.a().getString(R.string.atl);
        l.b(str, "");
        return str;
    }

    public static String e() {
        String str;
        String str2;
        String str3;
        String str4;
        if (g() != null) {
            ff g2 = g();
            String str5 = null;
            if (!(g2 == null || g2.f90031a == null)) {
                ff g3 = g();
                if (g3 != null) {
                    str2 = g3.f90031a;
                } else {
                    str2 = null;
                }
                if (!p.a(str2, "disclosure_continue", false)) {
                    ff g4 = g();
                    if (g4 != null) {
                        str3 = g4.f90031a;
                    } else {
                        str3 = null;
                    }
                    if (p.a(str3, "OK", false)) {
                        str = d.a().getString(R.string.h6b);
                    } else {
                        ff g5 = g();
                        if (g5 != null) {
                            str4 = g5.f90031a;
                        } else {
                            str4 = null;
                        }
                        if (a(str4) == 0) {
                            str = d.a().getString(R.string.b84);
                        } else {
                            Context a2 = d.a();
                            ff g6 = g();
                            if (g6 != null) {
                                str5 = g6.f90031a;
                            }
                            str = a2.getString(a(str5));
                        }
                    }
                    l.b(str, "");
                    return str;
                }
            }
        }
        str = d.a().getString(R.string.b84);
        l.b(str, "");
        return str;
    }

    public static String f() {
        String str;
        String str2;
        String str3;
        String str4;
        if (g() != null) {
            ff g2 = g();
            String str5 = null;
            if (!(g2 == null || g2.f90032b == null)) {
                ff g3 = g();
                if (g3 != null) {
                    str2 = g3.f90031a;
                } else {
                    str2 = null;
                }
                if (!p.a(str2, "none_close", false)) {
                    ff g4 = g();
                    if (g4 != null) {
                        str3 = g4.f90032b;
                    } else {
                        str3 = null;
                    }
                    if (p.a(str3, "Social_permissionPopup_disagree1", false)) {
                        str = d.a().getString(R.string.gb);
                    } else {
                        ff g5 = g();
                        if (g5 != null) {
                            str4 = g5.f90032b;
                        } else {
                            str4 = null;
                        }
                        if (a(str4) == 0) {
                            str = d.a().getString(R.string.dih);
                        } else {
                            Context a2 = d.a();
                            ff g6 = g();
                            if (g6 != null) {
                                str5 = g6.f90032b;
                            }
                            str = a2.getString(a(str5));
                        }
                    }
                    l.b(str, "");
                    return str;
                }
            }
        }
        str = d.a().getString(R.string.dih);
        l.b(str, "");
        return str;
    }

    private static int a(String str) {
        return d.a().getResources().getIdentifier(str, "string", d.a().getPackageName());
    }
}
