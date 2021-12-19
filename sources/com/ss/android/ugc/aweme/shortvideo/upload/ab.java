package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab {
    static {
        Covode.recordClassIndex(86473);
    }

    static final class a extends m implements h.f.a.b<String, List<? extends v>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f131973a = new a();

        static {
            Covode.recordClassIndex(86474);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ List<? extends v> invoke(String str) {
            return a(str);
        }

        public static List<v> a(String str) {
            l.d(str, "");
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    if (jSONObject != null) {
                        int optInt = jSONObject.optInt("max_speed");
                        JSONObject optJSONObject = jSONObject.optJSONObject("setting");
                        if (optJSONObject != null) {
                            String jSONObject2 = optJSONObject.toString();
                            l.b(jSONObject2, "");
                            arrayList.add(new v(optInt, jSONObject2));
                        }
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return arrayList;
        }
    }

    public static final String a(UploadSpeedInfo uploadSpeedInfo) {
        String a2;
        Object next;
        if (uploadSpeedInfo == null || uploadSpeedInfo.getSpeed() <= 0 || (a2 = com.bytedance.ies.abmock.b.a().a(true, "ve_synthesis_settings_by_upload_speed", "")) == null || a2.length() == 0) {
            return null;
        }
        List<v> a3 = a.a(a2);
        if ((!a3.isEmpty()) && a3 != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : a3) {
                if (((long) t.f132152a) > uploadSpeedInfo.getSpeed()) {
                    arrayList.add(t);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int i2 = ((v) next).f132152a;
                    do {
                        Object next2 = it.next();
                        int i3 = ((v) next2).f132152a;
                        if (i2 > i3) {
                            next = next2;
                            i2 = i3;
                        }
                    } while (it.hasNext());
                }
            }
            v vVar = (v) next;
            if (vVar != null) {
                uploadSpeedInfo.setUsedCompilerSettingGroup(vVar.f132152a);
                return vVar.f132153b;
            }
        }
        return null;
    }

    public static final class b<T> implements Comparator {
        static {
            Covode.recordClassIndex(86475);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.f118504c), Integer.valueOf(t2.f118504c));
        }
    }

    public static final class c<T> implements Comparator {
        static {
            Covode.recordClassIndex(86476);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.f118504c), Integer.valueOf(t2.f118504c));
        }
    }
}
