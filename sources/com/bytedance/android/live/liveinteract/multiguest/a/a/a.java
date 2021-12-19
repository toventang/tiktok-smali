package com.bytedance.android.live.liveinteract.multiguest.a.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.platform.common.g.i;
import com.bytedance.android.live.liveinteract.platform.common.g.o;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.chatroom.model.b.e;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.List;
import org.json.JSONObject;

public final class a extends RecyclerView.a<c> {

    /* renamed from: a  reason: collision with root package name */
    public b f11026a;

    /* renamed from: b  reason: collision with root package name */
    public List<e> f11027b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnClickListener f11028c = new View.OnClickListener() {
        /* class com.bytedance.android.live.liveinteract.multiguest.a.a.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(5925);
        }

        public final void onClick(View view) {
            String secUid;
            if (a.this.f11026a != null && view.getTag() != null) {
                Object tag = view.getTag();
                if (tag instanceof e) {
                    e eVar = (e) tag;
                    User user = eVar.f15722c;
                    view.setEnabled(false);
                    if (a.this.a() < d.a().x) {
                        i.a(0, user.getId(), eVar.a());
                        b bVar = a.this.f11026a;
                        long id = user.getId();
                        if (user.getSecUid() == null) {
                            secUid = "";
                        } else {
                            secUid = user.getSecUid();
                        }
                        bVar.a(id, secUid, eVar.a());
                        return;
                    }
                    i.a(1, user.getId(), eVar.a());
                    ao.a(y.e(), (int) R.string.grn);
                }
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private View.OnClickListener f11029d = new View.OnClickListener() {
        /* class com.bytedance.android.live.liveinteract.multiguest.a.a.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(5926);
        }

        public final void onClick(View view) {
            if (a.this.f11026a != null && view.getTag() != null) {
                Object tag = view.getTag();
                if (tag instanceof User) {
                    User user = (User) tag;
                    long id = user.getId();
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.android.live.core.d.a.a(jSONObject, "guest_user_id", id);
                    i iVar = i.f11979j;
                    i.a((i) true, (boolean) "disconnect_guest_click", (String) jSONObject, (JSONObject) 0);
                    a.this.f11026a.a(user);
                }
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private View.OnClickListener f11030e = b.f11039a;

    /* renamed from: f  reason: collision with root package name */
    private int f11031f;

    public interface b {
        static {
            Covode.recordClassIndex(5928);
        }

        void a(long j2, String str, String str2);

        void a(User user);
    }

    static {
        Covode.recordClassIndex(5924);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ c onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f11027b.size();
    }

    public final int a() {
        int i2 = 0;
        for (e eVar : this.f11027b) {
            if (2 == eVar.f15724e) {
                i2++;
            }
        }
        return i2;
    }

    public final int b() {
        int i2 = 0;
        for (e eVar : this.f11027b) {
            if (1 == eVar.f15724e) {
                i2++;
            }
        }
        return i2;
    }

    public final void c() {
        Object a2 = com.bytedance.android.live.liveinteract.api.c.e.f10014a.a("MULTI_GUEST_DATA_HOLDER");
        for (e eVar : this.f11027b) {
            if (a2 instanceof com.bytedance.android.live.liveinteract.multiguest.opt.a.a) {
                o.a(eVar.f15722c.getId(), ((com.bytedance.android.live.liveinteract.multiguest.opt.a.a) a2).q);
            } else {
                o.a(eVar.f15722c.getId(), (n) null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return this.f11031f;
    }

    public final void a(List<e> list) {
        this.f11027b = list;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.a.a$a  reason: collision with other inner class name */
    public static class C0205a extends c {

        /* renamed from: a  reason: collision with root package name */
        View f11034a;

        /* renamed from: b  reason: collision with root package name */
        View f11035b;

        static {
            Covode.recordClassIndex(5927);
        }

        C0205a(View view) {
            super(view);
            this.f11034a = view.findViewById(R.id.acs);
            this.f11035b = view.findViewById(R.id.amk);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends RecyclerView.ViewHolder {

        /* renamed from: c  reason: collision with root package name */
        AvatarIconView f11036c;

        /* renamed from: d  reason: collision with root package name */
        TextView f11037d;

        /* renamed from: e  reason: collision with root package name */
        TextView f11038e;

        static {
            Covode.recordClassIndex(5929);
        }

        c(View view) {
            super(view);
            this.f11036c = (AvatarIconView) view.findViewById(R.id.ph);
            this.f11037d = (TextView) view.findViewById(R.id.cs_);
            this.f11038e = (TextView) view.findViewById(R.id.akm);
        }
    }

    public final void a(long j2) {
        int size = this.f11027b.size();
        if (size > 0) {
            int i2 = 0;
            do {
                e eVar = this.f11027b.get(i2);
                if (eVar == null || eVar.f15722c == null || eVar.f15722c.getId() != j2) {
                    i2++;
                } else if (i2 >= 0 && i2 < size) {
                    this.f11027b.remove(i2);
                    notifyItemRemoved(i2);
                    return;
                } else {
                    return;
                }
            } while (i2 < size);
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(6225);
        if (i2 == 0) {
            viewHolder = new C0205a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ba7, (ViewGroup) null));
        } else {
            viewHolder = new c(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ba6, viewGroup, false));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(6225);
        return viewHolder;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00aa  */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(com.bytedance.android.live.liveinteract.multiguest.a.a.a.c r10, int r11) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.a.a.a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public a(b bVar, List<e> list, int i2) {
        this.f11026a = bVar;
        if (list != null) {
            this.f11027b = list;
            if (i2 == 0 || i2 == 1) {
                this.f11031f = i2;
                return;
            }
            throw new IllegalArgumentException("Type must be 1 for anchor or 2 for audience.");
        }
        throw new RuntimeException("List can not be null.");
    }
}
