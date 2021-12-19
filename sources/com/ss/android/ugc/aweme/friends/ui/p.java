package com.ss.android.ugc.aweme.friends.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ufr.d;
import com.ss.android.ugc.aweme.ufr.g;
import f.a.d.f;

final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ContactsActivity f97264a;

    static {
        Covode.recordClassIndex(61792);
    }

    p(ContactsActivity contactsActivity) {
        this.f97264a = contactsActivity;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        ContactsActivity contactsActivity = this.f97264a;
        d dVar = (d) obj;
        if ((dVar.f141689a == g.REQUEST_ACTUAL_PERMISSION || dVar.f141689a == g.REQUEST_UID_PERMISSION) && !dVar.f141690b.f141691a) {
            if (dVar.f141690b.f141693c == 1) {
                contactsActivity.f97065m = true;
            } else {
                contactsActivity.finish();
            }
        }
        if (dVar.f141689a == g.SYNC_STATUS && dVar.f141690b.f141691a) {
            contactsActivity.d();
        }
    }
}
