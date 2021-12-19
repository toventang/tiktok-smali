package com.ss.android.ugc.aweme.comment.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final h[] f71271a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final h f71272b = i.a((h.f.a.a) a.f71276a);

    /* renamed from: c  reason: collision with root package name */
    public static final d f71273c = new d();

    private d() {
    }

    static final class a extends m implements h.f.a.a<Map<Integer, ? extends UrlModel>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f71276a = new a();

        static {
            Covode.recordClassIndex(43879);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, ? extends UrlModel> invoke() {
            return d.a();
        }
    }

    static {
        Covode.recordClassIndex(43878);
    }

    public static Map<Integer, UrlModel> a() {
        h[] hVarArr = (h[]) SettingsManager.a().a("social_bubble_anchors", h[].class, f71271a);
        try {
            HashMap hashMap = new HashMap();
            if (hVarArr != null) {
                for (h hVar : hVarArr) {
                    hashMap.put(Integer.valueOf(hVar.f71286a), hVar.f71287b);
                }
            }
            return hashMap;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.comment.util.i.b("AnchorsResourceSettings", String.valueOf(e2.getMessage()));
            return new LinkedHashMap();
        }
    }
}
