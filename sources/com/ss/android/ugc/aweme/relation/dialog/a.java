package com.ss.android.ugc.aweme.relation.dialog;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.a.k;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.friends.ui.y;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.dialog.c;
import com.zhiliaoapp.musically.R;
import h.a.af;
import h.a.n;
import h.f.b.g;
import h.f.b.l;
import h.m.p;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class a extends f<User> {

    /* renamed from: c  reason: collision with root package name */
    public static final C3112a f120377c = new C3112a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final b f120378a = new b(1);

    /* renamed from: b  reason: collision with root package name */
    public final String f120379b;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, Boolean> f120380d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final k<User> f120381e;

    static {
        Covode.recordClassIndex(78322);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.dialog.a$a  reason: collision with other inner class name */
    public static final class C3112a {
        static {
            Covode.recordClassIndex(78323);
        }

        private C3112a() {
        }

        public /* synthetic */ C3112a(byte b2) {
            this();
        }
    }

    public static final class b extends User {
        private int recDialogType;

        static {
            Covode.recordClassIndex(78324);
        }

        public b() {
            this(0, 1, null);
        }

        public static int com_ss_android_ugc_aweme_relation_dialog_SocialRecFriendsDialogAdapter$SocialRecDialogHint_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
            return i2;
        }

        public static /* synthetic */ b copy$default(b bVar, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = bVar.recDialogType;
            }
            return bVar.copy(i2);
        }

        public final int component1() {
            return this.recDialogType;
        }

        public final b copy(int i2) {
            return new b(i2);
        }

        @Override // com.ss.android.ugc.aweme.profile.model.User
        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.recDialogType == ((b) obj).recDialogType;
            }
            return true;
        }

        @Override // com.ss.android.ugc.aweme.profile.model.User
        public final int hashCode() {
            return com_ss_android_ugc_aweme_relation_dialog_SocialRecFriendsDialogAdapter$SocialRecDialogHint_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.recDialogType);
        }

        public final String toString() {
            return "SocialRecDialogHint(recDialogType=" + this.recDialogType + ")";
        }

        public final int getRecDialogType() {
            return this.recDialogType;
        }

        public final void setRecDialogType(int i2) {
            this.recDialogType = i2;
        }

        public b(int i2) {
            this.recDialogType = i2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i2, int i3, g gVar) {
            this((i3 & 1) != 0 ? 0 : i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        User user = (User) this.f76354l.get(i2);
        if (!(user instanceof b) || ((b) user).getRecDialogType() != 1) {
            return 0;
        }
        return 1;
    }

    public a(k<User> kVar, String str) {
        l.d(kVar, "");
        this.f120381e = kVar;
        this.f120379b = str;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        if (i2 != 1) {
            com.ss.android.ugc.aweme.friends.service.a aVar = com.ss.android.ugc.aweme.friends.service.a.f97047a;
            Context context = viewGroup.getContext();
            l.b(context, "");
            y a2 = aVar.a(context, this.f120380d, false, false);
            if (a2 == null) {
                l.b();
            }
            a2.setEnterFrom("foru_boarding");
            a2.setIgnoreRecFriendsCardExp(true);
            a2.setListener(this.f120381e);
            return new d(a2);
        }
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2p, viewGroup, false);
        l.b(a3, "");
        c cVar = new c(a3);
        String str = this.f120379b;
        if (str == null) {
            str = "";
        }
        l.d(str, "");
        cVar.f120393b = str;
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (viewHolder == null) {
            return;
        }
        if (viewHolder instanceof c) {
            c cVar = (c) viewHolder;
            cVar.f120392a.setMovementMethod(LinkMovementMethod.getInstance());
            cVar.f120392a.setHighlightColor(androidx.core.content.b.c(cVar.f120392a.getContext(), R.color.c9));
            Context context = cVar.f120392a.getContext();
            l.b(context, "");
            String string = context.getResources().getString(R.string.cwj);
            l.b(string, "");
            Context context2 = cVar.f120392a.getContext();
            l.b(context2, "");
            String string2 = context2.getResources().getString(R.string.cab, string);
            l.b(string2, "");
            int a2 = p.a((CharSequence) string2, string, 0, false, 6);
            int length = string.length() + a2;
            SpannableString spannableString = new SpannableString(string2);
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && a2 >= 0) {
                spannableString.setSpan(new c.a(cVar), a2, length, 34);
                spannableString.setSpan(new StyleSpan(1), a2, length, 34);
            }
            cVar.f120392a.setText(spannableString);
        } else if (viewHolder instanceof d) {
            d dVar = (d) viewHolder;
            Object obj = this.f76354l.get(i2);
            l.b(obj, "");
            User user = (User) obj;
            l.d(user, "");
            dVar.f120395a.setData(user);
            dVar.f120395a.setPositionInApiList(i2);
        }
    }

    public final void a(User user, int i2) {
        l.d(user, "");
        List list = this.f76354l;
        l.b(list, "");
        Iterator it = n.a((Collection<?>) list).iterator();
        while (it.hasNext()) {
            int a2 = ((af) it).a();
            Object obj = this.f76354l.get(a2);
            l.b(obj, "");
            if (TextUtils.equals(((User) obj).getUid(), user.getUid())) {
                Object obj2 = this.f76354l.get(a2);
                l.b(obj2, "");
                ((User) obj2).setFollowStatus(i2);
                notifyItemChanged(a2);
            }
        }
    }
}
