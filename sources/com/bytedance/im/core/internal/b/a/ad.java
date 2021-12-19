package com.bytedance.im.core.internal.b.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.internal.b.a;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.b;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.f;
import com.bytedance.im.core.proto.ConversationParticipantsListRequestBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.bytedance.im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;

public final class ad extends w<List<ah>> {

    /* renamed from: a  reason: collision with root package name */
    public List<ah> f38284a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f38285b;

    static {
        Covode.recordClassIndex(22927);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    public ad() {
        this(true);
    }

    public ad(boolean z) {
        super(IMCMD.CONVERSATION_PARTICIPANTS_LIST.getValue(), null);
        this.f38284a = new ArrayList();
        this.f38285b = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.conversation_participants_body == null || kVar.f38725f.body.conversation_participants_body.participants_page == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, final Runnable runnable) {
        if (!kVar.l() || !a(kVar)) {
            b(kVar);
            runnable.run();
            e.a(kVar, false).a();
            return;
        }
        ParticipantsPage participantsPage = kVar.f38725f.body.conversation_participants_body.participants_page;
        final String str = (String) kVar.f38723d[0];
        this.f38284a.addAll(f.a(str, participantsPage.participants));
        if (participantsPage.has_more.booleanValue()) {
            a(str, participantsPage.cursor.longValue(), kVar.f38722c);
        } else {
            d.a(new c<Pair<h, List<ah>>>() {
                /* class com.bytedance.im.core.internal.b.a.ad.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22928);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ Pair<h, List<ah>> a() {
                    int conversationType;
                    h a2 = j.a().a(str);
                    com.bytedance.im.core.internal.a.e.d(str);
                    String str = str;
                    if (a2 == null) {
                        conversationType = -1;
                    } else {
                        conversationType = a2.getConversationType();
                    }
                    com.bytedance.im.core.internal.a.e.a(str, conversationType, ad.this.f38284a);
                    return new Pair(com.bytedance.im.core.internal.a.c.a(str, true), ad.this.f38284a);
                }
            }, new b<Pair<h, List<ah>>>() {
                /* class com.bytedance.im.core.internal.b.a.ad.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(22929);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(Pair<h, List<ah>> pair) {
                    Pair<h, List<ah>> pair2 = pair;
                    if (ad.this.f38285b) {
                        if (pair2.first != null) {
                            j.a().a((h) pair2.first, 7);
                        }
                        if (pair2.second != null && !((List) pair2.second).isEmpty()) {
                            j.a().a(str, (List) pair2.second);
                        }
                    }
                    a.f38233g.remove(str);
                    ad.this.a(pair2.second);
                    runnable.run();
                    e.a(kVar, true).a();
                }
            });
        }
    }

    public final long a(String str, long j2, com.bytedance.im.core.internal.d.j jVar) {
        if (a.b(str)) {
            return -1;
        }
        a.c(str);
        h a2 = j.a().a(str);
        if (a2 == null) {
            return -1;
        }
        RequestBody build = new RequestBody.Builder().conversation_participants_body(new ConversationParticipantsListRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).cursor(Long.valueOf(j2)).build()).build();
        return a(a2.getInboxType(), build, jVar, str, Long.valueOf(j2));
    }
}
