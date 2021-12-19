package com.bytedance.tux.b;

import android.view.View;
import android.widget.Checkable;
import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Object> f44666a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<e, Map<Integer, Object>> f44667b;

    static {
        Covode.recordClassIndex(27315);
    }

    public final Map<Integer, Object> a(View view) {
        l.c(view, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ag.a(this.f44666a, linkedHashMap);
        if (!this.f44667b.isEmpty()) {
            for (Map.Entry<e, Map<Integer, Object>> entry : this.f44667b.entrySet()) {
                e key = entry.getKey();
                l.c(view, "");
                if ((key.f44670a == null || !(!l.a(key.f44670a, Boolean.valueOf(view.isPressed())))) && ((key.f44671b == null || !(!l.a(key.f44671b, Boolean.valueOf(view.isFocused())))) && ((key.f44672c == null || !(!l.a(key.f44672c, Boolean.valueOf(view.isSelected())))) && ((key.f44673d == null || !(!l.a(key.f44673d, Boolean.valueOf(view.isEnabled())))) && ((key.f44674e == null || !(!l.a(key.f44674e, Boolean.valueOf(view.isActivated())))) && (key.f44675f == null || !(view instanceof Checkable) || !(!l.a(key.f44675f, Boolean.valueOf(((Checkable) view).isChecked()))))))))) {
                    linkedHashMap.putAll(entry.getValue());
                }
            }
        }
        return linkedHashMap;
    }

    public final Map<Integer, Object> a(e eVar) {
        l.c(eVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ag.a(this.f44666a, linkedHashMap);
        if (!this.f44667b.isEmpty()) {
            for (Map.Entry<e, Map<Integer, Object>> entry : this.f44667b.entrySet()) {
                e key = entry.getKey();
                l.c(eVar, "");
                if ((key.f44670a == null || !(!l.a(key.f44670a, eVar.f44670a))) && ((key.f44671b == null || !(!l.a(key.f44671b, eVar.f44671b))) && ((key.f44672c == null || !(!l.a(key.f44672c, eVar.f44672c))) && ((key.f44673d == null || !(!l.a(key.f44673d, eVar.f44673d))) && ((key.f44674e == null || !(!l.a(key.f44674e, eVar.f44674e))) && (key.f44675f == null || !(!l.a(key.f44675f, eVar.f44675f)))))))) {
                    linkedHashMap.putAll(entry.getValue());
                }
            }
        }
        return linkedHashMap;
    }

    public b(Map<Integer, Object> map, Map<e, Map<Integer, Object>> map2) {
        l.c(map, "");
        l.c(map2, "");
        this.f44666a = map;
        this.f44667b = map2;
    }
}
