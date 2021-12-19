package com.ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.o;
import com.ss.android.ugc.aweme.account.login.v;
import h.a.i;
import h.a.n;
import h.a.z;
import h.m.l;
import java.util.List;
import java.util.ListIterator;

public final class s {
    @c(a = "show_num")

    /* renamed from: a  reason: collision with root package name */
    public Integer f65502a;
    @c(a = "sign_up_order")

    /* renamed from: b  reason: collision with root package name */
    public String f65503b;
    @c(a = "log_in_order")

    /* renamed from: c  reason: collision with root package name */
    public String f65504c;
    @c(a = "recover_account_url")

    /* renamed from: d  reason: collision with root package name */
    public String f65505d;
    @c(a = "platform_configs")

    /* renamed from: e  reason: collision with root package name */
    public o f65506e;

    static {
        Covode.recordClassIndex(40283);
    }

    public final v[] a(boolean z) {
        String str;
        List list;
        if (z) {
            str = this.f65503b;
        } else {
            str = this.f65504c;
        }
        if (str == null) {
            return null;
        }
        List<String> split = new l(",").split(str, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        list = n.d((Iterable) split, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        list = z.INSTANCE;
        v[] vVarArr = new v[list.size()];
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            vVarArr[i2] = v.valueOf((String) list.get(i2));
        }
        return (v[]) i.o(vVarArr);
    }
}
