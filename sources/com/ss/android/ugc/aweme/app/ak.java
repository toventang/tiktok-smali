package com.ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ak<T> extends aj<List<T>> {

    /* renamed from: d  reason: collision with root package name */
    private Class<T> f66564d;

    static {
        Covode.recordClassIndex(40919);
    }

    /* renamed from: d */
    public final List<T> c() {
        String string = SharePrefCache.inst().getSharePref().getString(this.f66562b, "");
        if (TextUtils.isEmpty(string)) {
            return (List) this.f66561a;
        }
        String[] split = string.split(",");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str : split) {
            Class<T> cls = this.f66564d;
            if (cls == String.class) {
                arrayList.add(str);
            } else if (cls == Integer.class) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str)));
            } else if (cls == Float.class) {
                arrayList.add(Float.valueOf(Float.parseFloat(str)));
            } else if (cls == Long.class) {
                arrayList.add(Long.valueOf(Long.parseLong(str)));
            } else if (cls == Boolean.class) {
                arrayList.add(Boolean.valueOf(Boolean.parseBoolean(str)));
            } else {
                throw new RuntimeException("un support type: " + this.f66564d.getName());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.app.aj
    public final /* synthetic */ void a(Object obj) {
        Collection collection = (Collection) obj;
        SharedPreferences.Editor edit = SharePrefCache.inst().getSharePref().edit();
        if (b.a(collection)) {
            edit.remove(this.f66562b);
        } else {
            edit.putString(this.f66562b, TextUtils.join(",", collection));
        }
        edit.apply();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.app.aj
    public final /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        Collection collection = (Collection) obj;
        if (b.a(collection)) {
            editor.remove(this.f66562b);
        } else {
            editor.putString(this.f66562b, TextUtils.join(",", collection));
        }
    }

    public ak(Class<T> cls, String str, List<T> list) {
        super(str, list);
        this.f66564d = cls;
    }
}
