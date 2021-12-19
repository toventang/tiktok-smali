package com.ss.android.ugc.aweme.live.slot;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.af;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.live.slot.c;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;

public final class e extends v {

    /* renamed from: a  reason: collision with root package name */
    public c.C2783c f108618a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f108619b;

    /* renamed from: c  reason: collision with root package name */
    IIconSlot.b f108620c;

    /* renamed from: d  reason: collision with root package name */
    c.a f108621d;

    static {
        Covode.recordClassIndex(69612);
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b6s);
        bVar.f22374a = 2;
        bVar.f22375b = R.style.a2c;
        bVar.a(new ColorDrawable(0));
        bVar.f22380g = 80;
        if (this.f108620c == IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR) {
            bVar.f22379f = 0.5f;
        } else {
            bVar.f22379f = 0.0f;
        }
        return bVar;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle).cloneInContext(new ContextThemeWrapper(getActivity(), (int) R.style.mj));
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r.a("livesdk_tiktokec_action_sheet_show", new d().a("author_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()).a("room_id", this.f108621d.a()).a("EVENT_ORIGIN_FEATURE", "TEMAI").a("live_status", this.f108621d.f108594d).a("page_name", "business_action_sheet").f66730a);
    }

    public e(IIconSlot.b bVar, c.a aVar) {
        this.f108620c = bVar;
        this.f108621d = aVar;
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.d0w).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.live.slot.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69613);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                e.this.dismiss();
            }
        });
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.e66);
        this.f108619b = recyclerView;
        getActivity();
        recyclerView.setLayoutManager(new SSLinearLayoutManager(1));
        final d dVar = new d(this, this.f108620c, this.f108621d);
        for (final Map.Entry<ab, IIconSlot.SlotViewModel> entry : this.f108618a.f108600b.entrySet()) {
            entry.getValue().f12714b.observe(getViewLifecycleOwner(), new u<Boolean>() {
                /* class com.ss.android.ugc.aweme.live.slot.e.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(69614);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    if (e.this.isDetached()) {
                        return;
                    }
                    if (Boolean.TRUE.equals(bool)) {
                        d dVar = dVar;
                        ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> abVar = (ab) entry.getKey();
                        l.d(abVar, "");
                        int a2 = af.a(abVar.g());
                        int size = dVar.f108602a.size();
                        int i2 = 0;
                        int size2 = dVar.f108602a.size();
                        while (true) {
                            if (i2 >= size2) {
                                break;
                            } else if (a2 < af.a(dVar.f108602a.get(i2).g())) {
                                size = i2;
                                break;
                            } else {
                                i2++;
                            }
                        }
                        dVar.f108602a.add(size, abVar);
                        dVar.notifyDataSetChanged();
                        ((ab) entry.getKey()).a("before_live_dialog_item");
                        return;
                    }
                    d dVar2 = dVar;
                    Object key = entry.getKey();
                    l.d(key, "");
                    dVar2.f108602a.remove(key);
                    dVar2.notifyDataSetChanged();
                }
            });
        }
        this.f108619b.setAdapter(dVar);
    }
}
