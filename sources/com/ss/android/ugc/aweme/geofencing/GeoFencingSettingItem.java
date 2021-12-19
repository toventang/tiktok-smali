package com.ss.android.ugc.aweme.geofencing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity;
import com.ss.android.ugc.aweme.port.in.g;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class GeoFencingSettingItem extends PublishSettingItem {

    /* renamed from: c  reason: collision with root package name */
    public static final a f98992c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<List<com.ss.android.ugc.aweme.geofencing.c.a>> f98993a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    boolean f98994b;

    static {
        Covode.recordClassIndex(62943);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62945);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ List $list;
        final /* synthetic */ GeoFencingSettingItem this$0;

        static {
            Covode.recordClassIndex(62949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(GeoFencingSettingItem geoFencingSettingItem, List list) {
            super(0);
            this.this$0 = geoFencingSettingItem;
            this.$list = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f98993a.postValue(com.ss.android.ugc.aweme.geofencing.b.a.a(this.$list));
            return z.f158842a;
        }
    }

    public static boolean a() {
        com.ss.android.ugc.aweme.port.in.z A = g.a().A();
        if (!A.b() || !A.f() || Build.VERSION.SDK_INT < 21) {
            return true;
        }
        return false;
    }

    public final List<String> getRegionCodeList() {
        List<com.ss.android.ugc.aweme.geofencing.c.a> value = this.f98993a.getValue();
        if (value == null) {
            return h.a.z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(n.a((Iterable) value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCode());
        }
        return arrayList;
    }

    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ List $list;
        final /* synthetic */ GeoFencingSettingItem this$0;

        static {
            Covode.recordClassIndex(62947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(GeoFencingSettingItem geoFencingSettingItem, List list) {
            super(0);
            this.this$0 = geoFencingSettingItem;
            this.$list = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            List<com.ss.android.ugc.aweme.geofencing.c.a> arrayList;
            t<List<com.ss.android.ugc.aweme.geofencing.c.a>> tVar = this.this$0.f98993a;
            List list = this.$list;
            if (list != null) {
                List<com.ss.android.ugc.aweme.geofencing.c.a> a2 = com.ss.android.ugc.aweme.geofencing.b.b.a();
                arrayList = new ArrayList<>();
                for (Object obj : list) {
                    ListIterator<com.ss.android.ugc.aweme.geofencing.c.a> listIterator = a2.listIterator(a2.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        com.ss.android.ugc.aweme.geofencing.c.a previous = listIterator.previous();
                        if (l.a((Object) previous.getTranslation(), obj)) {
                            if (previous != null) {
                                arrayList.add(previous);
                            }
                        }
                    }
                }
            } else {
                arrayList = h.a.z.INSTANCE;
            }
            tVar.postValue(arrayList);
            return z.f158842a;
        }
    }

    public final void b() {
        List<com.ss.android.ugc.aweme.geofencing.c.a> value = this.f98993a.getValue();
        if (value != null) {
            String str = "";
            l.b(value, str);
            int size = value.size();
            if (size != 0) {
                if (size != 1) {
                    String string = getContext().getString(R.string.caz, ((com.ss.android.ugc.aweme.geofencing.c.a) n.g((List) value)).getTranslation(), Integer.valueOf(value.size() - 1));
                    l.b(string, str);
                    str = string;
                } else {
                    str = ((com.ss.android.ugc.aweme.geofencing.c.a) n.g((List) value)).getTranslation();
                }
            }
            setSubtitle(str);
        }
    }

    public static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeoFencingSettingItem f98996a;

        static {
            Covode.recordClassIndex(62946);
        }

        public b(GeoFencingSettingItem geoFencingSettingItem) {
            this.f98996a = geoFencingSettingItem;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f98996a.b();
        }
    }

    public static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeoFencingSettingItem f98997a;

        static {
            Covode.recordClassIndex(62948);
        }

        public d(GeoFencingSettingItem geoFencingSettingItem) {
            this.f98997a = geoFencingSettingItem;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f98997a.b();
        }
    }

    public final void setReadOnly(boolean z) {
        this.f98994b = z;
        if (z) {
            c();
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f98998a;

        static {
            Covode.recordClassIndex(62950);
        }

        f(u uVar) {
            this.f98998a = uVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.u */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool;
            List list = (List) obj;
            u uVar = this.f98998a;
            if (list != null) {
                bool = Boolean.valueOf(list.isEmpty());
            } else {
                bool = null;
            }
            uVar.onChanged(bool);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GeoFencingSettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        if (a()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        setDrawableLeft(2131232302);
        setTitle(R.string.esr);
        setSubtitle("");
        setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ GeoFencingSettingItem f98995a;

            static {
                Covode.recordClassIndex(62944);
            }

            {
                this.f98995a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                GeoFencingSettingItem geoFencingSettingItem = this.f98995a;
                Context context = geoFencingSettingItem.getContext();
                l.b(context, "");
                Activity a2 = com.ss.android.ugc.aweme.scene.a.a(context);
                List<com.ss.android.ugc.aweme.geofencing.c.a> value = geoFencingSettingItem.f98993a.getValue();
                if (value == null) {
                    value = h.a.z.INSTANCE;
                }
                boolean z = geoFencingSettingItem.f98994b;
                l.d(value, "");
                if (a2 != null) {
                    Intent intent = new Intent(a2, GeoFencingStatusActivity.class);
                    intent.putExtra("extra.read_only", z);
                    com.ss.android.ugc.aweme.geofencing.d.a.a(intent, value);
                    a2.startActivityForResult(intent, 1988, null);
                }
            }
        });
    }
}
