package com.ss.android.ugc.aweme.playerkit.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.i;
import com.google.gson.o;
import com.ss.android.ugc.playerkit.exp.PlayerSettingService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final i f115465a;

    /* renamed from: b  reason: collision with root package name */
    public final i f115466b;

    /* renamed from: c  reason: collision with root package name */
    public o f115467c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f115468d;

    /* renamed from: e  reason: collision with root package name */
    public final i f115469e;

    /* renamed from: f  reason: collision with root package name */
    public final List<e> f115470f;

    /* renamed from: g  reason: collision with root package name */
    public String f115471g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public i f115472a;

        /* renamed from: b  reason: collision with root package name */
        public i f115473b;

        /* renamed from: c  reason: collision with root package name */
        public o f115474c;

        /* renamed from: d  reason: collision with root package name */
        public Map<String, String> f115475d;

        /* renamed from: e  reason: collision with root package name */
        public List<e> f115476e = new ArrayList();

        static {
            Covode.recordClassIndex(74130);
        }
    }

    static {
        Covode.recordClassIndex(74129);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public i f115477a;

        /* renamed from: b  reason: collision with root package name */
        public i f115478b;

        /* renamed from: c  reason: collision with root package name */
        public o f115479c;

        /* renamed from: d  reason: collision with root package name */
        public Map<String, String> f115480d;

        /* renamed from: e  reason: collision with root package name */
        public i f115481e;

        /* renamed from: f  reason: collision with root package name */
        public List<e> f115482f = new ArrayList();

        static {
            Covode.recordClassIndex(74131);
        }

        public static boolean a() {
            if (PlayerSettingService.isDebug()) {
                return true;
            }
            return false;
        }
    }

    private f(i iVar, i iVar2, o oVar, i iVar3, List<e> list) {
        this.f115465a = iVar;
        this.f115466b = iVar2;
        this.f115467c = oVar;
        this.f115469e = iVar3;
        this.f115470f = list;
    }

    public /* synthetic */ f(i iVar, i iVar2, o oVar, i iVar3, List list, byte b2) {
        this(iVar, iVar2, oVar, iVar3, list);
    }
}
