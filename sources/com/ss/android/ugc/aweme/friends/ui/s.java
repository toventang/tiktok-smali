package com.ss.android.ugc.aweme.friends.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.f.c;
import com.ss.android.ugc.aweme.friends.i.f;
import com.ss.android.ugc.aweme.friends.model.ContactModel;
import com.ss.android.ugc.aweme.friends.ui.ContactsActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class s implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final ContactsActivity.AnonymousClass2 f97268a;

    /* renamed from: b  reason: collision with root package name */
    private final User f97269b;

    /* renamed from: c  reason: collision with root package name */
    private final ContactModel f97270c;

    static {
        Covode.recordClassIndex(61795);
    }

    s(ContactsActivity.AnonymousClass2 r1, User user, ContactModel contactModel) {
        this.f97268a = r1;
        this.f97269b = user;
        this.f97270c = contactModel;
    }

    @Override // com.ss.android.ugc.aweme.friends.f.c.b
    public final void a(String str) {
        ContactsActivity.AnonymousClass2 r5 = this.f97268a;
        User user = this.f97269b;
        ContactModel contactModel = this.f97270c;
        boolean unused = f.a(ContactsActivity.this, contactModel.phoneNumber, ContactsActivity.this.p.a(in.j(user)) + str, R.string.coa);
    }
}
