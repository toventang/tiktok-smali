package com.ss.android.ugc.aweme.qainvitation.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.qainvitation.e.c;
import com.ss.android.ugc.aweme.qainvitation.e.g;
import com.ss.android.ugc.aweme.qainvitation.e.j;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.ExecutionException;
import l.b.e;
import l.b.f;
import l.b.o;

public final class QAInvitationAPI {

    /* renamed from: a  reason: collision with root package name */
    public static final h f118954a = i.a((h.f.a.a) b.f118956a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f118955b = new a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.api.QAInvitationAPI$QAInvitationAPI  reason: collision with other inner class name */
    public interface AbstractC3052QAInvitationAPI {
        static {
            Covode.recordClassIndex(77280);
        }

        @f(a = "/tiktok/interaction/mention/general/check/v1")
        t<j> getFilteredContacts(@l.b.t(a = "mention_type") String str, @l.b.t(a = "uids") String str2);

        @f(a = "/tiktok/v1/forum/question/inviters/")
        t<com.ss.android.ugc.aweme.qainvitation.e.b> getInvitedList(@l.b.t(a = "user_id") long j2, @l.b.t(a = "question_id") long j3, @l.b.t(a = "cursor") int i2, @l.b.t(a = "count") int i3);

        @f(a = "/tiktok/v1/forum/question/invitees/")
        t<c> getInviteeList(@l.b.t(a = "question_id") long j2);

        @f(a = "/tiktok/interaction/mention/recent/contact/query/v1")
        t<g> getRecentContacts(@l.b.t(a = "mention_type") int i2);

        @o(a = "/tiktok/v1/forum/question/invite/")
        @e
        t<com.ss.android.ugc.aweme.qainvitation.e.a> submitInviteeList(@l.b.c(a = "question_id") long j2, @l.b.c(a = "invited_users") String str);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77281);
        }

        private static AbstractC3052QAInvitationAPI a() {
            return (AbstractC3052QAInvitationAPI) QAInvitationAPI.f118954a.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static t<g> a(int i2) {
            try {
                return a().getRecentContacts(i2);
            } catch (ExecutionException unused) {
                t<g> b2 = t.b(new g((byte) 0));
                l.b(b2, "");
                return b2;
            }
        }

        public static t<c> a(long j2) {
            try {
                return a().getInviteeList(j2);
            } catch (ExecutionException unused) {
                t<c> b2 = t.b(new c((byte) 0));
                l.b(b2, "");
                return b2;
            }
        }

        public static t<com.ss.android.ugc.aweme.qainvitation.e.a> a(long j2, String str) {
            l.d(str, "");
            try {
                return a().submitInviteeList(j2, str);
            } catch (ExecutionException unused) {
                t<com.ss.android.ugc.aweme.qainvitation.e.a> b2 = t.b(new com.ss.android.ugc.aweme.qainvitation.e.a((byte) 0));
                l.b(b2, "");
                return b2;
            }
        }

        public static t<j> a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            try {
                return a().getFilteredContacts(str, str2);
            } catch (ExecutionException unused) {
                t<j> b2 = t.b(new j((byte) 0));
                l.b(b2, "");
                return b2;
            }
        }

        public static t<com.ss.android.ugc.aweme.qainvitation.e.b> a(long j2, long j3, int i2) {
            try {
                return a().getInvitedList(j2, j3, i2, 30);
            } catch (ExecutionException unused) {
                t<com.ss.android.ugc.aweme.qainvitation.e.b> b2 = t.b(new com.ss.android.ugc.aweme.qainvitation.e.b((byte) 0));
                l.b(b2, "");
                return b2;
            }
        }
    }

    static final class b extends m implements h.f.a.a<AbstractC3052QAInvitationAPI> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f118956a = new b();

        static {
            Covode.recordClassIndex(77282);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AbstractC3052QAInvitationAPI invoke() {
            return RetrofitFactory.a().a(com.ss.android.c.b.f59141e).a(AbstractC3052QAInvitationAPI.class);
        }
    }

    static {
        Covode.recordClassIndex(77279);
    }
}
