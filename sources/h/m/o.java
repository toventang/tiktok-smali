package h.m;

import com.bytedance.covode.number.Covode;

final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final l f158836a;

    /* renamed from: b  reason: collision with root package name */
    public static final o f158837b = new o();

    private o() {
    }

    static {
        Covode.recordClassIndex(105364);
        String concat = "[eE][+-]?".concat("(\\p{Digit}+)");
        f158836a = new l("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("(" + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + concat + ")?)|(\\.(" + "(\\p{Digit}+)" + ")(" + concat + ")?)|((" + ("(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')') + ")[pP][+-]?" + "(\\p{Digit}+)" + ')') + ")[fFdD]?))[\\x00-\\x20]*");
    }
}
