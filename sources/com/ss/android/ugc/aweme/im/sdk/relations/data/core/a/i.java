package com.ss.android.ugc.aweme.im.sdk.relations.data.core.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.group.a.e;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.a.n;
import h.f.b.j;
import h.f.b.l;
import java.util.Collection;
import java.util.List;

public final class i extends f<h, IMContact> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f103059a = new b((byte) 0);

    static {
        Covode.recordClassIndex(66071);
    }

    public static final class a extends f.a<i, h, IMContact> {

        /* renamed from: a  reason: collision with root package name */
        public final i f103060a = new i();

        static {
            Covode.recordClassIndex(66072);
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f.a
        public final /* bridge */ /* synthetic */ i a() {
            return this.f103060a;
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f.a
        public final /* bridge */ /* synthetic */ i b() {
            return this.f103060a;
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(66073);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f
    public final h.f.a.b<h, IMContact> a() {
        return new c(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f
    public final List<h> d() {
        throw new UnsupportedOperationException("Recent not support load more");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f
    public final List<h> c() {
        List<h> a2 = a.C0745a.a().a();
        com.ss.android.ugc.aweme.im.service.m.a.c("RecentLoader", "loadInternal: " + a2.size());
        return n.g((Collection) a2);
    }

    static final /* synthetic */ class c extends j implements h.f.a.b<h, IMContact> {
        static {
            Covode.recordClassIndex(66074);
        }

        c(i iVar) {
            super(1, iVar, i.class, "convert", "convert(Lcom/bytedance/im/core/model/Conversation;)Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.ss.android.ugc.aweme.im.service.model.IMUser */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ IMContact invoke(h hVar) {
            IMConversation iMConversation;
            IMUser c2;
            h hVar2 = hVar;
            l.d(hVar2, "");
            if (hVar2.isSingleChat()) {
                long j2 = 0;
                if (b.a.c(hVar2.getConversationId()) <= 0 || (c2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.c(hVar2)) == 0) {
                    return null;
                }
                c2.setStickTop(hVar2.isStickTop());
                c2.setType(1);
                ai lastMessage = hVar2.getLastMessage();
                if (lastMessage != null) {
                    j2 = lastMessage.getCreatedAt();
                }
                if (hVar2.isStickTop()) {
                    j2 = Math.max(j2, hVar2.getUpdatedTime());
                }
                c2.setFriendRecTime(j2);
                iMConversation = c2;
            } else {
                IMConversation iMConversation2 = new IMConversation();
                iMConversation2.setConversationId(hVar2.getConversationId());
                iMConversation2.setConversationType(hVar2.getConversationType());
                iMConversation2.setConversationMemberCount(hVar2.getMemberCount());
                iMConversation2.setStickTop(hVar2.isStickTop());
                e.a.a();
                iMConversation2.setConversationAvatar(e.b(hVar2));
                com.bytedance.im.core.d.i coreInfo = hVar2.getCoreInfo();
                if (coreInfo != null) {
                    iMConversation2.setConversationName(coreInfo.getName());
                }
                iMConversation2.setType(1);
                iMConversation = iMConversation2;
            }
            iMConversation.setIsRecentContact(1);
            return iMConversation;
        }
    }
}
