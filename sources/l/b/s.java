package l.b;

import com.bytedance.covode.number.Covode;

public @interface s {
    static {
        Covode.recordClassIndex(105751);
    }

    String a();

    boolean b() default false;
}
