package com.ss.android.ugc.aweme.story.base.a;

import com.bytedance.covode.number.Covode;

public final class c {
    @com.google.gson.a.c(a = "edit_toolbar_text_auto_fade_time")

    /* renamed from: a  reason: collision with root package name */
    public final int f136873a;
    @com.google.gson.a.c(a = "edit_toolbar_text_display_frequency")

    /* renamed from: b  reason: collision with root package name */
    public final int f136874b;

    static {
        Covode.recordClassIndex(89450);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f136873a == cVar.f136873a && this.f136874b == cVar.f136874b;
    }

    public final int hashCode() {
        return (this.f136873a * 31) + this.f136874b;
    }

    public final String toString() {
        return "StoryCreationConfigure(editToolbarTextAutoFadeTime=" + this.f136873a + ", editToolbarTextDisplayFrequency=" + this.f136874b + ")";
    }

    private c() {
        this.f136873a = 4000;
        this.f136874b = 0;
    }

    public /* synthetic */ c(byte b2) {
        this();
    }
}
