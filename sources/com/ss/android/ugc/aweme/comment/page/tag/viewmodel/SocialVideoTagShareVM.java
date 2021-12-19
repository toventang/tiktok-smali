package com.ss.android.ugc.aweme.comment.page.tag.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import f.a.d.f;
import java.util.ArrayList;
import java.util.List;

public final class SocialVideoTagShareVM extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final t<Aweme> f72281a = new t<>();

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f72285a = new b();

        static {
            Covode.recordClassIndex(44561);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(44559);
    }

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f72282a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f72283b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SocialVideoTagShareVM f72284c;

        static {
            Covode.recordClassIndex(44560);
        }

        public a(Aweme aweme, String str, SocialVideoTagShareVM socialVideoTagShareVM) {
            this.f72282a = aweme;
            this.f72283b = str;
            this.f72284c = socialVideoTagShareVM;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ArrayList arrayList;
            List<InteractionTagUserInfo> taggedUsers;
            InteractionTagInfo interactionTagInfo = this.f72282a.getInteractionTagInfo();
            if (interactionTagInfo == null || (taggedUsers = interactionTagInfo.getTaggedUsers()) == null) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (T t : taggedUsers) {
                    if (!TextUtils.equals(this.f72283b, t.getUid())) {
                        arrayList2.add(t);
                    }
                }
                arrayList = arrayList2;
            }
            InteractionTagInfo interactionTagInfo2 = this.f72282a.getInteractionTagInfo();
            if (interactionTagInfo2 != null) {
                interactionTagInfo2.setTaggedUsers(arrayList);
            }
            this.f72284c.f72281a.postValue(this.f72282a);
        }
    }
}
