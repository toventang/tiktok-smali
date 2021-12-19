package com.ss.android.ugc.aweme.main.guide;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;

public final class a implements IFollowTabBubbleGuideHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final a f109263a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f109264b = "";

    /* renamed from: c  reason: collision with root package name */
    private static User f109265c;

    private a() {
    }

    @Override // com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper
    public final String a() {
        return f109264b;
    }

    static {
        Covode.recordClassIndex(69973);
    }

    @Override // com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper
    public final void a(User user) {
        f109265c = user;
    }
}
