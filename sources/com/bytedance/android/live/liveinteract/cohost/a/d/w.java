package com.bytedance.android.live.liveinteract.cohost.a.d;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.cohost.a.a.a;
import com.bytedance.android.live.liveinteract.cohost.a.a.b;
import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.android.live.liveinteract.cohost.a.a.e;
import com.bytedance.android.live.liveinteract.cohost.ui.c.a;
import com.bytedance.android.live.liveinteract.cohost.ui.c.c;
import com.bytedance.android.live.liveinteract.linkroom.a.a.a;
import com.bytedance.android.live.liveinteract.match.b.a.a;
import com.bytedance.android.livesdk.j.u;
import com.bytedance.android.livesdk.model.k;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import h.f.b.l;
import java.util.Stack;

public final class w implements e.b {

    /* renamed from: a  reason: collision with root package name */
    public final e.c f10153a;

    /* renamed from: b  reason: collision with root package name */
    private final Stack<d.b<?>> f10154b = new Stack<>();

    public enum a {
        BUTTON_FRAGMENT,
        INVITE_USER_LIST_FRAGMENT,
        INVITEE_FRAGMENT,
        SETTING_FRAGMENT,
        TYPE_PK_BE_INVITED,
        MULTI_LIVE_ANCHOR_SETTING_FRAGMENT;

        static {
            Covode.recordClassIndex(5334);
        }
    }

    static {
        Covode.recordClassIndex(5333);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.e.b
    public final void c() {
        this.f10154b.clear();
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.e.b
    public final boolean a() {
        if (this.f10154b.isEmpty()) {
            return false;
        }
        this.f10154b.pop();
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.e.b
    public final d.b<?> b() {
        if (!this.f10154b.isEmpty()) {
            return this.f10154b.peek();
        }
        return null;
    }

    public w(e.c cVar) {
        l.d(cVar, "");
        this.f10153a = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: java.util.Stack<com.bytedance.android.live.liveinteract.cohost.a.a.d$b<?>> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: com.bytedance.android.live.liveinteract.linkroom.d.a.a */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: com.bytedance.android.live.liveinteract.cohost.ui.c.b */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: com.bytedance.android.live.liveinteract.cohost.ui.c.a */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: com.bytedance.android.live.liveinteract.match.ui.b.a */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.e.b
    public final boolean a(a aVar, d.c cVar) {
        Boolean bool;
        c cVar2;
        String str;
        boolean z;
        l.d(aVar, "");
        DataChannel dataChannel = null;
        if (this.f10153a.f() != null) {
            k kVar = (k) DataChannelGlobal.f34575d.b(u.class);
            if (kVar != null) {
                bool = Boolean.valueOf(kVar.isEndPage());
            } else {
                bool = null;
            }
            if (!p.a(bool)) {
                if (cVar != null) {
                    cVar.f10036c = this.f10153a.f();
                }
                if (this.f10153a instanceof d.e) {
                    switch (x.f10156a[aVar.ordinal()]) {
                        case 1:
                            if (cVar instanceof a.c) {
                                a.c cVar3 = (a.c) cVar;
                                com.bytedance.android.live.liveinteract.linkroom.d.a.a aVar2 = new com.bytedance.android.live.liveinteract.linkroom.d.a.a((byte) 0);
                                aVar2.f10034b = new com.bytedance.android.live.liveinteract.linkroom.a.c.a(aVar2);
                                aVar2.f10033a = (d.e) this.f10153a;
                                if (cVar3 != null) {
                                    dataChannel = cVar3.f10036c;
                                }
                                aVar2.f10597d = dataChannel;
                                cVar2 = aVar2;
                                this.f10154b.push(cVar2 == 1 ? 1 : 0);
                                return true;
                            }
                            break;
                        case 2:
                            if (cVar instanceof b.c) {
                                d.e eVar = (d.e) this.f10153a;
                                b.c cVar4 = (b.c) cVar;
                                l.d(eVar, "");
                                l.d(cVar4, "");
                                com.bytedance.android.live.liveinteract.cohost.ui.c.b bVar = new com.bytedance.android.live.liveinteract.cohost.ui.c.b((byte) 0);
                                DataChannel dataChannel2 = cVar4.f10036c;
                                l.b(dataChannel2, "");
                                bVar.f10034b = new b(bVar, dataChannel2);
                                bVar.f10033a = eVar;
                                bVar.f10316g = cVar4.f10028a;
                                bVar.f10317h = cVar4.f10036c;
                                cVar2 = bVar;
                                this.f10154b.push(cVar2 == 1 ? 1 : 0);
                                return true;
                            }
                            break;
                        case 3:
                            if (cVar instanceof a.c) {
                                a.c cVar5 = (a.c) cVar;
                                l.d(cVar5, "");
                                com.bytedance.android.live.liveinteract.cohost.ui.c.a aVar3 = new com.bytedance.android.live.liveinteract.cohost.ui.c.a((byte) 0);
                                aVar3.f10034b = new a(aVar3, cVar5.f10036c);
                                aVar3.f10033a = (d.e) this.f10153a;
                                com.bytedance.android.livesdk.model.message.d.c.d dVar = cVar5.f10021a;
                                if (!(dVar == null || dVar.f19542h == null)) {
                                    long j2 = b.a.a().f9941f;
                                    ImageModel imageModel = dVar.f19542h.f19517e;
                                    l.b(imageModel, "");
                                    String str2 = dVar.f19542h.f19518f;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    int i2 = dVar.f19542h.f19516d;
                                    String str3 = dVar.f19542h.f19520h;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    com.bytedance.android.livesdk.model.message.d.c.b bVar2 = dVar.f19542h;
                                    l.b(bVar2, "");
                                    if (bVar2.f19522j == null) {
                                        str = "";
                                    } else {
                                        str = bVar2.f19522j.title;
                                        if (str == null) {
                                            str = "";
                                        }
                                    }
                                    aVar3.f10297g = new a.c(j2, imageModel, str2, i2, str3, str, dVar.f19542h.f19521i);
                                    if (dVar.f19542h.f19519g != null) {
                                        if (dVar.f19542h.f19519g.f19512c != null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        aVar3.f10299i = z;
                                    }
                                }
                                aVar3.f10298h = new a.C0171a(a.b.a().getOwnerUserId());
                                aVar3.f10295e = a.b.a().getId();
                                aVar3.f10294d = b.a.a().f9940e;
                                aVar3.f10296f = b.a.a().p;
                                cVar2 = aVar3;
                                this.f10154b.push(cVar2 == 1 ? 1 : 0);
                                return true;
                            }
                            break;
                        case 4:
                            c cVar6 = new c((byte) 0);
                            cVar6.f10034b = new c(cVar6);
                            cVar6.f10033a = (d.e) this.f10153a;
                            cVar2 = cVar6;
                            this.f10154b.push(cVar2 == 1 ? 1 : 0);
                            return true;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            if (cVar instanceof a.C0197a) {
                                d.e eVar2 = (d.e) this.f10153a;
                                a.C0197a aVar4 = (a.C0197a) cVar;
                                l.d(eVar2, "");
                                l.d(aVar4, "");
                                com.bytedance.android.live.liveinteract.match.ui.b.a aVar5 = new com.bytedance.android.live.liveinteract.match.ui.b.a();
                                DataChannel dataChannel3 = aVar4.f10036c;
                                l.b(dataChannel3, "");
                                aVar5.f10034b = new com.bytedance.android.live.liveinteract.match.b.g.a(aVar5, dataChannel3);
                                aVar5.f10033a = eVar2;
                                aVar5.f10826e = aVar4.f10672b;
                                aVar5.f10825d = aVar4.f10671a;
                                cVar2 = aVar5;
                                this.f10154b.push(cVar2 == 1 ? 1 : 0);
                                return true;
                            }
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            if (cVar instanceof a.c) {
                                a.c cVar7 = (a.c) cVar;
                                com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a aVar6 = new com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a((byte) 0);
                                aVar6.f10034b = new com.bytedance.android.live.liveinteract.multilive.anchor.d.a(aVar6);
                                aVar6.f10033a = (d.e) this.f10153a;
                                if (cVar7 != null) {
                                    dataChannel = cVar7.f10036c;
                                }
                                aVar6.f11704d = dataChannel;
                                cVar2 = aVar6;
                                this.f10154b.push(cVar2 == 1 ? 1 : 0);
                                return true;
                            }
                            break;
                    }
                }
            }
        }
        return false;
    }
}
