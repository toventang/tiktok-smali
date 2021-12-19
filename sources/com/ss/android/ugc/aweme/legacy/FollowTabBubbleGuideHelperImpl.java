package com.ss.android.ugc.aweme.legacy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper;
import com.ss.android.ugc.aweme.main.guide.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.b;

public class FollowTabBubbleGuideHelperImpl implements IFollowTabBubbleGuideHelper {

    /* renamed from: a  reason: collision with root package name */
    private final IFollowTabBubbleGuideHelper f107300a = a.f109263a;

    static {
        Covode.recordClassIndex(68659);
    }

    @Override // com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper
    public final String a() {
        return this.f107300a.a();
    }

    public static IFollowTabBubbleGuideHelper b() {
        MethodCollector.i(2781);
        Object a2 = b.a(IFollowTabBubbleGuideHelper.class, false);
        if (a2 != null) {
            IFollowTabBubbleGuideHelper iFollowTabBubbleGuideHelper = (IFollowTabBubbleGuideHelper) a2;
            MethodCollector.o(2781);
            return iFollowTabBubbleGuideHelper;
        }
        if (b.ch == null) {
            synchronized (IFollowTabBubbleGuideHelper.class) {
                try {
                    if (b.ch == null) {
                        b.ch = new FollowTabBubbleGuideHelperImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2781);
                    throw th;
                }
            }
        }
        FollowTabBubbleGuideHelperImpl followTabBubbleGuideHelperImpl = (FollowTabBubbleGuideHelperImpl) b.ch;
        MethodCollector.o(2781);
        return followTabBubbleGuideHelperImpl;
    }

    @Override // com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper
    public final void a(User user) {
        this.f107300a.a(user);
    }
}
