package com.bytedance.ies.sdk.widgets;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.a.b;
import h.f.b.g;
import h.v;
import h.z;
import java.util.HashMap;
import java.util.Map;

public final class WidgetCreateTimeUtil implements WidgetManager.a {
    private final b<Widget, z> onWidgetLoadedListener;
    private final Map<String, Object> widgetCreateTimeMap;

    static {
        Covode.recordClassIndex(20729);
    }

    public WidgetCreateTimeUtil() {
        this(null, 1, null);
    }

    public final void clear() {
        this.widgetCreateTimeMap.clear();
    }

    public final void send() {
        c.a("ttlive_widget_create_cost_time", 0, ag.a(v.a("widget_time", this.widgetCreateTimeMap)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.bytedance.android.widget.Widget, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public WidgetCreateTimeUtil(b<? super Widget, z> bVar) {
        this.onWidgetLoadedListener = bVar;
        this.widgetCreateTimeMap = new HashMap();
    }

    @Override // com.bytedance.android.widget.WidgetManager.a
    public final boolean needUploadTime(Widget widget) {
        Boolean bool = null;
        if (!(widget instanceof LiveRecyclableWidget)) {
            widget = null;
        }
        LiveRecyclableWidget liveRecyclableWidget = (LiveRecyclableWidget) widget;
        if (liveRecyclableWidget != null) {
            bool = Boolean.valueOf(liveRecyclableWidget.isInitialized());
        }
        return p.c(bool);
    }

    @Override // com.bytedance.android.widget.WidgetManager.a
    public final void onLoad(Widget widget, long j2) {
        Class<?> cls;
        String simpleName;
        Map<String, Object> map = this.widgetCreateTimeMap;
        if (widget != null && (cls = widget.getClass()) != null && (simpleName = cls.getSimpleName()) != null) {
            map.put(simpleName, Long.valueOf(j2));
            b<Widget, z> bVar = this.onWidgetLoadedListener;
            if (bVar != null) {
                bVar.invoke(widget);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WidgetCreateTimeUtil(b bVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : bVar);
    }
}
