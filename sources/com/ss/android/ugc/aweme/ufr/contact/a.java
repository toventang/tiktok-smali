package com.ss.android.ugc.aweme.ufr.contact;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel;
import f.a.c;
import f.a.e;
import h.f.b.l;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f141684a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(92603);
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.contact.a$a  reason: collision with other inner class name */
    static final class C3767a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f141685a;

        static {
            Covode.recordClassIndex(92604);
        }

        C3767a(int i2) {
            this.f141685a = i2;
        }

        @Override // f.a.e
        public final void a(final c cVar) {
            l.d(cVar, "");
            new ThirdPartyFriendModel("contact", this.f141685a).uploadHashedContacts().a(new g() {
                /* class com.ss.android.ugc.aweme.ufr.contact.a.C3767a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(92605);
                }

                @Override // b.g
                public final /* synthetic */ Object then(i iVar) {
                    l.b(iVar, "");
                    if (iVar.b() || iVar.c()) {
                        cVar.a(iVar.e());
                    } else {
                        cVar.a();
                    }
                    return z.f158842a;
                }
            });
        }
    }
}
