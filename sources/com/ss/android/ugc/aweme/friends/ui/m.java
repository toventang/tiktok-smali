package com.ss.android.ugc.aweme.friends.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.e.a;
import f.a.d.f;

final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ContactsActivity f97261a;

    static {
        Covode.recordClassIndex(61789);
    }

    m(ContactsActivity contactsActivity) {
        this.f97261a = contactsActivity;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        ContactsActivity contactsActivity = this.f97261a;
        a.b("find_friends_page", "guide", "contact", "", "did", "auto", null);
        contactsActivity.d();
    }
}
