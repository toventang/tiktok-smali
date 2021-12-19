package com.ss.android.ugc.aweme.profile.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.base.utils.h;
import com.zhiliaoapp.musically.R;
import java.util.List;

public class cr<T extends a> extends l {

    /* renamed from: b  reason: collision with root package name */
    public List<T> f117096b;

    /* renamed from: c  reason: collision with root package name */
    public List<Integer> f117097c;

    static {
        Covode.recordClassIndex(75616);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f117096b.size();
    }

    public final Fragment b() {
        int indexOf = this.f117097c.indexOf(0);
        if (indexOf < 0 || indexOf >= this.f117096b.size()) {
            return null;
        }
        return this.f117096b.get(indexOf);
    }

    public cr(i iVar) {
        super(iVar);
    }

    @Override // androidx.fragment.app.l
    public final Fragment a(int i2) {
        return this.f117096b.get(i2);
    }

    @Override // androidx.fragment.app.l
    public final long b(int i2) {
        return (long) this.f117097c.get(i2).intValue();
    }

    public final int d(int i2) {
        return this.f117097c.get(i2).intValue();
    }

    public final int e(int i2) {
        return this.f117097c.indexOf(Integer.valueOf(i2));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        if (this.f117096b.contains(obj)) {
            return this.f117096b.indexOf(obj);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i2) {
        Integer num = this.f117097c.get(i2);
        if (this.f117096b.get(i2) instanceof ar) {
            return ((ar) this.f117096b.get(i2)).c();
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 8) {
                            return h.b(R.string.ahp);
                        }
                        if (intValue == 16) {
                            return h.b(R.string.ahi);
                        }
                        if (intValue == 19) {
                            return h.b(R.string.c5l);
                        }
                        if (intValue == 26) {
                            return h.b(R.string.ajb);
                        }
                        switch (intValue) {
                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                                return h.b(R.string.ahk);
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                return h.b(R.string.ahn);
                            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                return h.b(R.string.bwm);
                            default:
                                return "";
                        }
                    } else if (this.f117096b.get(i2) != null && this.f117096b.get(i2).x) {
                        return h.b(R.string.ano);
                    }
                }
            }
            return h.b(R.string.c1d);
        }
        if (this.f117096b.get(i2) == null || !this.f117096b.get(i2).x) {
            return h.b(R.string.cbg);
        }
        return h.b(R.string.ano);
    }

    public cr(i iVar, List<T> list, List<Integer> list2) {
        super(iVar);
        this.f117096b = list;
        this.f117097c = list2;
    }
}
