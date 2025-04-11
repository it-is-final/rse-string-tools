package io.github.it_is_final.rse_string_tools;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class RseStringTools {
    private static Map<Byte, Character> buildCharacterMap(
            Version version,
            Language language
    ) {
        Map<Byte, Character> baseJapaneseMap = Map.<Byte, Character>ofEntries(
                Map.entry((byte)0x00, '　'),
                Map.entry((byte)0x01, 'あ'),
                Map.entry((byte)0x02, 'い'),
                Map.entry((byte)0x03, 'う'),
                Map.entry((byte)0x04, 'え'),
                Map.entry((byte)0x05, 'お'),
                Map.entry((byte)0x06, 'か'),
                Map.entry((byte)0x07, 'き'),
                Map.entry((byte)0x08, 'く'),
                Map.entry((byte)0x09, 'け'),
                Map.entry((byte)0x0A, 'こ'),
                Map.entry((byte)0x0B, 'さ'),
                Map.entry((byte)0x0C, 'し'),
                Map.entry((byte)0x0D, 'す'),
                Map.entry((byte)0x0E, 'せ'),
                Map.entry((byte)0x0F, 'そ'),
                Map.entry((byte)0x10, 'た'),
                Map.entry((byte)0x11, 'ち'),
                Map.entry((byte)0x12, 'つ'),
                Map.entry((byte)0x13, 'て'),
                Map.entry((byte)0x14, 'と'),
                Map.entry((byte)0x15, 'な'),
                Map.entry((byte)0x16, 'に'),
                Map.entry((byte)0x17, 'ぬ'),
                Map.entry((byte)0x18, 'ね'),
                Map.entry((byte)0x19, 'の'),
                Map.entry((byte)0x1A, 'は'),
                Map.entry((byte)0x1B, 'ひ'),
                Map.entry((byte)0x1C, 'ふ'),
                Map.entry((byte)0x1D, 'へ'),
                Map.entry((byte)0x1E, 'ほ'),
                Map.entry((byte)0x1F, 'ま'),
                Map.entry((byte)0x20, 'み'),
                Map.entry((byte)0x21, 'む'),
                Map.entry((byte)0x22, 'め'),
                Map.entry((byte)0x23, 'も'),
                Map.entry((byte)0x24, 'や'),
                Map.entry((byte)0x25, 'ゆ'),
                Map.entry((byte)0x26, 'よ'),
                Map.entry((byte)0x27, 'ら'),
                Map.entry((byte)0x28, 'り'),
                Map.entry((byte)0x29, 'る'),
                Map.entry((byte)0x2A, 'れ'),
                Map.entry((byte)0x2B, 'ろ'),
                Map.entry((byte)0x2C, 'わ'),
                Map.entry((byte)0x2D, 'を'),
                Map.entry((byte)0x2E, 'ん'),
                Map.entry((byte)0x2F, 'ぁ'),
                Map.entry((byte)0x30, 'ぃ'),
                Map.entry((byte)0x31, 'ぅ'),
                Map.entry((byte)0x32, 'ぇ'),
                Map.entry((byte)0x33, 'ぉ'),
                Map.entry((byte)0x34, 'ゃ'),
                Map.entry((byte)0x35, 'ゅ'),
                Map.entry((byte)0x36, 'ょ'),
                Map.entry((byte)0x37, 'が'),
                Map.entry((byte)0x38, 'ぎ'),
                Map.entry((byte)0x39, 'ぐ'),
                Map.entry((byte)0x3A, 'げ'),
                Map.entry((byte)0x3B, 'ご'),
                Map.entry((byte)0x3C, 'ざ'),
                Map.entry((byte)0x3D, 'じ'),
                Map.entry((byte)0x3E, 'ず'),
                Map.entry((byte)0x3F, 'ぜ'),
                Map.entry((byte)0x40, 'ぞ'),
                Map.entry((byte)0x41, 'だ'),
                Map.entry((byte)0x42, 'ぢ'),
                Map.entry((byte)0x43, 'づ'),
                Map.entry((byte)0x44, 'で'),
                Map.entry((byte)0x45, 'ど'),
                Map.entry((byte)0x46, 'ば'),
                Map.entry((byte)0x47, 'び'),
                Map.entry((byte)0x48, 'ぶ'),
                Map.entry((byte)0x49, 'べ'),
                Map.entry((byte)0x4A, 'ぼ'),
                Map.entry((byte)0x4B, 'ぱ'),
                Map.entry((byte)0x4C, 'ぴ'),
                Map.entry((byte)0x4D, 'ぷ'),
                Map.entry((byte)0x4E, 'ぺ'),
                Map.entry((byte)0x4F, 'ぽ'),
                Map.entry((byte)0x50, 'っ'),
                Map.entry((byte)0x51, 'ア'),
                Map.entry((byte)0x52, 'イ'),
                Map.entry((byte)0x53, 'ウ'),
                Map.entry((byte)0x54, 'エ'),
                Map.entry((byte)0x55, 'オ'),
                Map.entry((byte)0x56, 'カ'),
                Map.entry((byte)0x57, 'キ'),
                Map.entry((byte)0x58, 'ク'),
                Map.entry((byte)0x59, 'ケ'),
                Map.entry((byte)0x5A, 'コ'),
                Map.entry((byte)0x5B, 'サ'),
                Map.entry((byte)0x5C, 'シ'),
                Map.entry((byte)0x5D, 'ス'),
                Map.entry((byte)0x5E, 'セ'),
                Map.entry((byte)0x5F, 'ソ'),
                Map.entry((byte)0x60, 'タ'),
                Map.entry((byte)0x61, 'チ'),
                Map.entry((byte)0x62, 'ツ'),
                Map.entry((byte)0x63, 'テ'),
                Map.entry((byte)0x64, 'ト'),
                Map.entry((byte)0x65, 'ナ'),
                Map.entry((byte)0x66, 'ニ'),
                Map.entry((byte)0x67, 'ヌ'),
                Map.entry((byte)0x68, 'ネ'),
                Map.entry((byte)0x69, 'ノ'),
                Map.entry((byte)0x6A, 'ハ'),
                Map.entry((byte)0x6B, 'ヒ'),
                Map.entry((byte)0x6C, 'フ'),
                Map.entry((byte)0x6D, 'ヘ'),
                Map.entry((byte)0x6E, 'ホ'),
                Map.entry((byte)0x6F, 'マ'),
                Map.entry((byte)0x70, 'ミ'),
                Map.entry((byte)0x71, 'ム'),
                Map.entry((byte)0x72, 'メ'),
                Map.entry((byte)0x73, 'モ'),
                Map.entry((byte)0x74, 'ヤ'),
                Map.entry((byte)0x75, 'ユ'),
                Map.entry((byte)0x76, 'ヨ'),
                Map.entry((byte)0x77, 'ラ'),
                Map.entry((byte)0x78, 'リ'),
                Map.entry((byte)0x79, 'ル'),
                Map.entry((byte)0x7A, 'レ'),
                Map.entry((byte)0x7B, 'ロ'),
                Map.entry((byte)0x7C, 'ワ'),
                Map.entry((byte)0x7D, 'ヲ'),
                Map.entry((byte)0x7E, 'ン'),
                Map.entry((byte)0x7F, 'ァ'),
                Map.entry((byte)0x80, 'ィ'),
                Map.entry((byte)0x81, 'ゥ'),
                Map.entry((byte)0x82, 'ェ'),
                Map.entry((byte)0x83, 'ォ'),
                Map.entry((byte)0x84, 'ャ'),
                Map.entry((byte)0x85, 'ュ'),
                Map.entry((byte)0x86, 'ョ'),
                Map.entry((byte)0x87, 'ガ'),
                Map.entry((byte)0x88, 'ギ'),
                Map.entry((byte)0x89, 'グ'),
                Map.entry((byte)0x8A, 'ゲ'),
                Map.entry((byte)0x8B, 'ゴ'),
                Map.entry((byte)0x8C, 'ザ'),
                Map.entry((byte)0x8D, 'ジ'),
                Map.entry((byte)0x8E, 'ズ'),
                Map.entry((byte)0x8F, 'ゼ'),
                Map.entry((byte)0x90, 'ゾ'),
                Map.entry((byte)0x91, 'ダ'),
                Map.entry((byte)0x92, 'ヂ'),
                Map.entry((byte)0x93, 'ヅ'),
                Map.entry((byte)0x94, 'デ'),
                Map.entry((byte)0x95, 'ド'),
                Map.entry((byte)0x96, 'バ'),
                Map.entry((byte)0x97, 'ビ'),
                Map.entry((byte)0x98, 'ブ'),
                Map.entry((byte)0x99, 'ベ'),
                Map.entry((byte)0x9A, 'ボ'),
                Map.entry((byte)0x9B, 'パ'),
                Map.entry((byte)0x9C, 'ピ'),
                Map.entry((byte)0x9D, 'プ'),
                Map.entry((byte)0x9E, 'ペ'),
                Map.entry((byte)0x9F, 'ポ'),
                Map.entry((byte)0xA0, 'ッ'),
                Map.entry((byte)0xA1, '０'),
                Map.entry((byte)0xA2, '１'),
                Map.entry((byte)0xA3, '２'),
                Map.entry((byte)0xA4, '３'),
                Map.entry((byte)0xA5, '４'),
                Map.entry((byte)0xA6, '５'),
                Map.entry((byte)0xA7, '６'),
                Map.entry((byte)0xA8, '７'),
                Map.entry((byte)0xA9, '８'),
                Map.entry((byte)0xAA, '９'),
                Map.entry((byte)0xAB, '！'),
                Map.entry((byte)0xAC, '？'),
                Map.entry((byte)0xAD, '。'),
                Map.entry((byte)0xAE, 'ー'),
                Map.entry((byte)0xAF, '・'),
                Map.entry((byte)0xB0, '‥'),
                Map.entry((byte)0xB1, '『'),
                Map.entry((byte)0xB2, '』'),
                Map.entry((byte)0xB3, '「'),
                Map.entry((byte)0xB4, '」'),
                Map.entry((byte)0xB5, '♂'),
                Map.entry((byte)0xB6, '♀'),
                Map.entry((byte)0xB7, '円'),
                Map.entry((byte)0xB8, '．'),
                Map.entry((byte)0xB9, '×'),
                Map.entry((byte)0xBA, '／'),
                Map.entry((byte)0xBB, 'Ａ'),
                Map.entry((byte)0xBC, 'Ｂ'),
                Map.entry((byte)0xBD, 'Ｃ'),
                Map.entry((byte)0xBE, 'Ｄ'),
                Map.entry((byte)0xBF, 'Ｅ'),
                Map.entry((byte)0xC0, 'Ｆ'),
                Map.entry((byte)0xC1, 'Ｇ'),
                Map.entry((byte)0xC2, 'Ｈ'),
                Map.entry((byte)0xC3, 'Ｉ'),
                Map.entry((byte)0xC4, 'Ｊ'),
                Map.entry((byte)0xC5, 'Ｋ'),
                Map.entry((byte)0xC6, 'Ｌ'),
                Map.entry((byte)0xC7, 'Ｍ'),
                Map.entry((byte)0xC8, 'Ｎ'),
                Map.entry((byte)0xC9, 'Ｏ'),
                Map.entry((byte)0xCA, 'Ｐ'),
                Map.entry((byte)0xCB, 'Ｑ'),
                Map.entry((byte)0xCC, 'Ｒ'),
                Map.entry((byte)0xCD, 'Ｓ'),
                Map.entry((byte)0xCE, 'Ｔ'),
                Map.entry((byte)0xCF, 'Ｕ'),
                Map.entry((byte)0xD0, 'Ｖ'),
                Map.entry((byte)0xD1, 'Ｗ'),
                Map.entry((byte)0xD2, 'Ｘ'),
                Map.entry((byte)0xD3, 'Ｙ'),
                Map.entry((byte)0xD4, 'Ｚ'),
                Map.entry((byte)0xD5, 'ａ'),
                Map.entry((byte)0xD6, 'ｂ'),
                Map.entry((byte)0xD7, 'ｃ'),
                Map.entry((byte)0xD8, 'ｄ'),
                Map.entry((byte)0xD9, 'ｅ'),
                Map.entry((byte)0xDA, 'ｆ'),
                Map.entry((byte)0xDB, 'ｇ'),
                Map.entry((byte)0xDC, 'ｈ'),
                Map.entry((byte)0xDD, 'ｉ'),
                Map.entry((byte)0xDE, 'ｊ'),
                Map.entry((byte)0xDF, 'ｋ'),
                Map.entry((byte)0xE0, 'ｌ'),
                Map.entry((byte)0xE1, 'ｍ'),
                Map.entry((byte)0xE2, 'ｎ'),
                Map.entry((byte)0xE3, 'ｏ'),
                Map.entry((byte)0xE4, 'ｐ'),
                Map.entry((byte)0xE5, 'ｑ'),
                Map.entry((byte)0xE6, 'ｒ'),
                Map.entry((byte)0xE7, 'ｓ'),
                Map.entry((byte)0xE8, 'ｔ'),
                Map.entry((byte)0xE9, 'ｕ'),
                Map.entry((byte)0xEA, 'ｖ'),
                Map.entry((byte)0xEB, 'ｗ'),
                Map.entry((byte)0xEC, 'ｘ'),
                Map.entry((byte)0xED, 'ｙ'),
                Map.entry((byte)0xEE, 'ｚ'),
                Map.entry((byte)0xEF, '►'),
                Map.entry((byte)0xF0, '：'),
                Map.entry((byte)0xF1, 'Ä'),
                Map.entry((byte)0xF2, 'Ö'),
                Map.entry((byte)0xF3, 'Ü'),
                Map.entry((byte)0xF4, 'ä'),
                Map.entry((byte)0xF5, 'ö'),
                Map.entry((byte)0xF6, 'ü'),
                Map.entry((byte)0xF7, '\0'),
                Map.entry((byte)0xF8, '\0'),
                Map.entry((byte)0xF9, '\0'),
                Map.entry((byte)0xFA, '\0'),
                Map.entry((byte)0xFB, '\0'),
                Map.entry((byte)0xFC, '\0'),
                Map.entry((byte)0xFD, '\0'),
                Map.entry((byte)0xFE, '\n'), 
                Map.entry((byte)0xFF, '\0')
        );
        Map<Byte, Character> baseNonJapaneseMap =
                Map.<Byte, Character>ofEntries(
                Map.entry((byte)0x00, ' '),
                Map.entry((byte)0x01, 'À'),
                Map.entry((byte)0x02, 'Á'),
                Map.entry((byte)0x03, 'Â'),
                Map.entry((byte)0x04, 'Ç'),
                Map.entry((byte)0x05, 'È'),
                Map.entry((byte)0x06, 'É'),
                Map.entry((byte)0x07, 'Ê'),
                Map.entry((byte)0x08, 'Ë'),
                Map.entry((byte)0x09, 'Ì'),
                Map.entry((byte)0x0B, 'Î'),
                Map.entry((byte)0x0C, 'Ï'),
                Map.entry((byte)0x0D, 'Ò'),
                Map.entry((byte)0x0E, 'Ó'),
                Map.entry((byte)0x0F, 'Ô'),
                Map.entry((byte)0x10, 'Œ'),
                Map.entry((byte)0x11, 'Ù'),
                Map.entry((byte)0x12, 'Ú'),
                Map.entry((byte)0x13, 'Û'),
                Map.entry((byte)0x14, 'Ñ'),
                Map.entry((byte)0x15, 'ß'),
                Map.entry((byte)0x16, 'à'),
                Map.entry((byte)0x17, 'á'),
                Map.entry((byte)0x19, 'ç'),
                Map.entry((byte)0x1A, 'è'),
                Map.entry((byte)0x1B, 'é'),
                Map.entry((byte)0x1C, 'ê'),
                Map.entry((byte)0x1D, 'ë'),
                Map.entry((byte)0x1E, 'ì'),
                Map.entry((byte)0x20, 'î'),
                Map.entry((byte)0x21, 'ï'),
                Map.entry((byte)0x22, 'ò'),
                Map.entry((byte)0x23, 'ó'),
                Map.entry((byte)0x24, 'ô'),
                Map.entry((byte)0x25, 'œ'),
                Map.entry((byte)0x26, 'ù'),
                Map.entry((byte)0x27, 'ú'),
                Map.entry((byte)0x28, 'û'),
                Map.entry((byte)0x29, 'ñ'),
                Map.entry((byte)0x2A, 'º'),
                Map.entry((byte)0x2B, 'ª'),
                Map.entry((byte)0x2C, ' '),
                Map.entry((byte)0x2D, '&'),
                Map.entry((byte)0x2E, '+'),
                Map.entry((byte)0x2F, ' '),
                Map.entry((byte)0x34, ' '),
                Map.entry((byte)0x35, '='),
                Map.entry((byte)0x36, ';'),
                Map.entry((byte)0x50, '▯'),
                Map.entry((byte)0x51, '¿'),
                Map.entry((byte)0x52, '¡'),
                Map.entry((byte)0x53, ' '),
                Map.entry((byte)0x54, ' '),
                Map.entry((byte)0x55, ' '),
                Map.entry((byte)0x56, ' '),
                Map.entry((byte)0x57, ' '),
                Map.entry((byte)0x58, ' '),
                Map.entry((byte)0x59, ' '),
                Map.entry((byte)0x5A, 'Í'),
                Map.entry((byte)0x5B, '%'),
                Map.entry((byte)0x5C, '('),
                Map.entry((byte)0x5D, ')'),
                Map.entry((byte)0x68, 'â'),
                Map.entry((byte)0x6F, 'í'),
                Map.entry((byte)0x79, '↑'),
                Map.entry((byte)0x7A, '↓'),
                Map.entry((byte)0x7B, '←'),
                Map.entry((byte)0x7C, '→'),
                Map.entry((byte)0x7D, ' '),
                Map.entry((byte)0x7E, ' '),
                Map.entry((byte)0x7F, ' '),
                Map.entry((byte)0x80, ' '),
                Map.entry((byte)0x81, ' '),
                Map.entry((byte)0x82, ' '),
                Map.entry((byte)0x83, ' '),
                Map.entry((byte)0x84, 'ᵉ'),
                Map.entry((byte)0x85, '<'),
                Map.entry((byte)0x86, '>'),
                Map.entry((byte)0xA0, ' '),
                Map.entry((byte)0xA1, '0'),
                Map.entry((byte)0xA2, '1'),
                Map.entry((byte)0xA3, '2'),
                Map.entry((byte)0xA4, '3'),
                Map.entry((byte)0xA5, '4'),
                Map.entry((byte)0xA6, '5'),
                Map.entry((byte)0xA7, '6'),
                Map.entry((byte)0xA8, '7'),
                Map.entry((byte)0xA9, '8'),
                Map.entry((byte)0xAA, '9'),
                Map.entry((byte)0xAB, '!'),
                Map.entry((byte)0xAC, '?'),
                Map.entry((byte)0xAD, '.'),
                Map.entry((byte)0xAE, '-'),
                Map.entry((byte)0xAF, '·'),
                Map.entry((byte)0xB0, '…'),
                Map.entry((byte)0xB1, '“'),
                Map.entry((byte)0xB2, '”'),
                Map.entry((byte)0xB3, '‘'),
                Map.entry((byte)0xB4, '’'),
                Map.entry((byte)0xB5, '♂'),
                Map.entry((byte)0xB6, '♀'),
                Map.entry((byte)0xB7, '$'),
                Map.entry((byte)0xB8, ','),
                Map.entry((byte)0xB9, '×'),
                Map.entry((byte)0xBA, '/'),
                Map.entry((byte)0xBB, 'A'),
                Map.entry((byte)0xBC, 'B'),
                Map.entry((byte)0xBD, 'C'),
                Map.entry((byte)0xBE, 'D'),
                Map.entry((byte)0xBF, 'E'),
                Map.entry((byte)0xC0, 'F'),
                Map.entry((byte)0xC1, 'G'),
                Map.entry((byte)0xC2, 'H'),
                Map.entry((byte)0xC3, 'I'),
                Map.entry((byte)0xC4, 'J'),
                Map.entry((byte)0xC5, 'K'),
                Map.entry((byte)0xC6, 'L'),
                Map.entry((byte)0xC7, 'M'),
                Map.entry((byte)0xC8, 'N'),
                Map.entry((byte)0xC9, 'O'),
                Map.entry((byte)0xCA, 'P'),
                Map.entry((byte)0xCB, 'Q'),
                Map.entry((byte)0xCC, 'R'),
                Map.entry((byte)0xCD, 'S'),
                Map.entry((byte)0xCE, 'T'),
                Map.entry((byte)0xCF, 'U'),
                Map.entry((byte)0xD0, 'V'),
                Map.entry((byte)0xD1, 'W'),
                Map.entry((byte)0xD2, 'X'),
                Map.entry((byte)0xD3, 'Y'),
                Map.entry((byte)0xD4, 'Z'),
                Map.entry((byte)0xD5, 'a'),
                Map.entry((byte)0xD6, 'b'),
                Map.entry((byte)0xD7, 'c'),
                Map.entry((byte)0xD8, 'd'),
                Map.entry((byte)0xD9, 'e'),
                Map.entry((byte)0xDA, 'f'),
                Map.entry((byte)0xDB, 'g'),
                Map.entry((byte)0xDC, 'h'),
                Map.entry((byte)0xDD, 'i'),
                Map.entry((byte)0xDE, 'j'),
                Map.entry((byte)0xDF, 'k'),
                Map.entry((byte)0xE0, 'l'),
                Map.entry((byte)0xE1, 'm'),
                Map.entry((byte)0xE2, 'n'),
                Map.entry((byte)0xE3, 'o'),
                Map.entry((byte)0xE4, 'p'),
                Map.entry((byte)0xE5, 'q'),
                Map.entry((byte)0xE6, 'r'),
                Map.entry((byte)0xE7, 's'),
                Map.entry((byte)0xE8, 't'),
                Map.entry((byte)0xE9, 'u'),
                Map.entry((byte)0xEA, 'v'),
                Map.entry((byte)0xEB, 'w'),
                Map.entry((byte)0xEC, 'x'),
                Map.entry((byte)0xED, 'y'),
                Map.entry((byte)0xEE, 'z'),
                Map.entry((byte)0xEF, '►'),
                Map.entry((byte)0xF0, ':'),
                Map.entry((byte)0xF1, 'Ä'),
                Map.entry((byte)0xF2, 'Ö'),
                Map.entry((byte)0xF3, 'Ü'),
                Map.entry((byte)0xF4, 'ä'),
                Map.entry((byte)0xF5, 'ö'),
                Map.entry((byte)0xF6, 'ü'),
                Map.entry((byte)0xF7, '\0'),
                Map.entry((byte)0xF8, '\0'),
                Map.entry((byte)0xF9, '\0'),
                Map.entry((byte)0xFA, '\0'),
                Map.entry((byte)0xFB, '\0'),
                Map.entry((byte)0xFC, '\0'),
                Map.entry((byte)0xFD, '\0'),
                Map.entry((byte)0xFE, '\n'),
                Map.entry((byte)0xFF, '\0')
        );
        HashMap<Byte, Character> cMap = new HashMap<>(
                language.equals(Language.JAPANESE)
                    ? baseJapaneseMap
                    : baseNonJapaneseMap
        );
        if (version.equals(Version.RS)) {
            // 0xF7-0xF9 are not control characters in Ruby/Sapphire.
            // In these games, they will always print as arrows.
            cMap.replace((byte)0xF7, '↑');
            cMap.replace((byte)0xF8, '↓');
            cMap.replace((byte)0xF9, '←');
        }
        if (
                language.equals(Language.JAPANESE)
                && version.equals(Version.FRLG)
           ) {
            // Japanese FireRed/LeafGreen uses a three-dot ellipsis
            // while all other game versions (JPN) uses a two-dot ellipsis
            cMap.replace((byte)0xB0, '…');
        }
        if (language.equals(Language.FRENCH)) {
            cMap.replace((byte)0xB1, '«');
            cMap.replace((byte)0xB2, '»');
            if (version.equals(Version.E)) {
                cMap.put((byte)0x64, ' ');
            }
        }
        if (language.equals(Language.GERMAN)) {
            cMap.replace((byte)0xB1, '„');
            cMap.replace((byte)0xB2, '“');
        }
        if (language.equals(Language.ITALIAN)) {
            cMap.put((byte)0x57, ' ');
            cMap.put((byte)0x58, ' ');
            cMap.put((byte)0x59, ' ');
            cMap.put((byte)0x5E, ' ');
            cMap.put((byte)0x5F, ' ');
            cMap.put((byte)0x60, ' ');
            cMap.put((byte)0x61, ' ');
            cMap.put((byte)0x62, ' ');
            cMap.put((byte)0x63, ' ');
        }
        if (
                !language.equals(Language.JAPANESE)
                && !version.equals(Version.E)
           ) {
            cMap.remove((byte)0x50);
            cMap.remove((byte)0x7D);
            cMap.remove((byte)0x7E);
            cMap.remove((byte)0x7F);
            cMap.remove((byte)0x80);
            cMap.remove((byte)0x81);
            cMap.remove((byte)0x82);
            cMap.remove((byte)0x83);
        }
        if (
                !language.equals(Language.JAPANESE)
                && version.equals(Version.RS)
           ) {
            for (byte i : baseJapaneseMap.keySet()) {
                cMap.putIfAbsent(i, baseJapaneseMap.get(i));
            }
        }
        return Collections.unmodifiableMap(cMap);
    }
    private static final Map<Language, Map<Byte, Character>> rubyCharacterMaps =
            Map.of(
                    Language.JAPANESE, buildCharacterMap(
                            Version.RS, Language.JAPANESE
                    ),
                    Language.ENGLISH, buildCharacterMap(
                            Version.RS, Language.ENGLISH
                    ),
                    Language.FRENCH, buildCharacterMap(
                            Version.RS, Language.FRENCH
                    ),
                    Language.ITALIAN, buildCharacterMap(
                            Version.RS, Language.ITALIAN
                    ),
                    Language.GERMAN, buildCharacterMap(
                            Version.RS, Language.GERMAN
                    ),
                    Language.SPANISH, buildCharacterMap(
                            Version.RS, Language.SPANISH
                    )
            );
    private static final Map<Language, Map<Byte, Character>> fireredCharacterMaps =
            Map.of(
                    Language.JAPANESE, buildCharacterMap(
                            Version.FRLG, Language.JAPANESE
                    ),
                    Language.ENGLISH, buildCharacterMap(
                            Version.FRLG, Language.ENGLISH
                    ),
                    Language.FRENCH, buildCharacterMap(
                            Version.FRLG, Language.FRENCH
                    ),
                    Language.ITALIAN, buildCharacterMap(
                            Version.FRLG, Language.ITALIAN
                    ),
                    Language.GERMAN, buildCharacterMap(
                            Version.FRLG, Language.GERMAN
                    ),
                    Language.SPANISH, buildCharacterMap(
                            Version.FRLG, Language.SPANISH
                    )
            );
    private static final Map<Language, Map<Byte, Character>> emeraldCharacterMaps =
            Map.of(
                    Language.JAPANESE, buildCharacterMap(
                            Version.E, Language.JAPANESE
                    ),
                    Language.ENGLISH, buildCharacterMap(
                            Version.E, Language.ENGLISH
                    ),
                    Language.FRENCH, buildCharacterMap(
                            Version.E, Language.FRENCH
                    ),
                    Language.ITALIAN, buildCharacterMap(
                            Version.E, Language.ITALIAN
                    ),
                    Language.GERMAN, buildCharacterMap(
                            Version.E, Language.GERMAN
                    ),
                    Language.SPANISH, buildCharacterMap(
                            Version.E, Language.SPANISH
                    )
            );
    public static Map<Byte, Character> getCharacterMap(
            Version version, Language language
    ) {
        return switch (version) {
            case RS -> rubyCharacterMaps.get(language);
            case E -> emeraldCharacterMaps.get(language);
            case FRLG -> fireredCharacterMaps.get(language);
        };
    }
    private static Map<Character, Byte> buildCharacterMapR(
            Version version,
            Language language
    ) {
        Map<Byte, Character> referenceMap = getCharacterMap(version, language);
        Map<Character, Byte> cMap = new HashMap<>();
        cMap.put('\n', (byte)0xfe);
        cMap.put('\0', (byte)0xff);
        for (byte i : referenceMap.keySet()) {
            cMap.putIfAbsent(referenceMap.get(i), i);
        }
        if (language.equals(Language.JAPANESE)) {
            cMap.put('‥', (byte)0xb0);
            cMap.put('＿', (byte)0x0);
            cMap.put(' ', (byte)0x0);
            cMap.put('0', (byte)0xa1);
            cMap.put('1', (byte)0xa2);
            cMap.put('2', (byte)0xa3);
            cMap.put('3', (byte)0xa4);
            cMap.put('4', (byte)0xa5);
            cMap.put('5', (byte)0xa6);
            cMap.put('6', (byte)0xa7);
            cMap.put('7', (byte)0xa8);
            cMap.put('8', (byte)0xa9);
            cMap.put('9', (byte)0xaa);
            cMap.put('!', (byte)0xab);
            cMap.put('?', (byte)0xac);
            cMap.put('¥', (byte)0xb7);
            cMap.put('·', (byte)0xaf);
            cMap.put('･', (byte)0xaf);
            cMap.put('-', (byte)0xae);
            cMap.put('–', (byte)0xae);
            cMap.put('…', (byte)0xb0);
            cMap.put('.', (byte)0xb8);
            cMap.put('/', (byte)0xba);
            cMap.put('A', (byte)0xbb);
            cMap.put('B', (byte)0xbc);
            cMap.put('C', (byte)0xbd);
            cMap.put('D', (byte)0xbe);
            cMap.put('E', (byte)0xbf);
            cMap.put('F', (byte)0xc0);
            cMap.put('G', (byte)0xc1);
            cMap.put('H', (byte)0xc2);
            cMap.put('I', (byte)0xc3);
            cMap.put('J', (byte)0xc4);
            cMap.put('K', (byte)0xc5);
            cMap.put('L', (byte)0xc6);
            cMap.put('M', (byte)0xc7);
            cMap.put('N', (byte)0xc8);
            cMap.put('O', (byte)0xc9);
            cMap.put('P', (byte)0xca);
            cMap.put('Q', (byte)0xcb);
            cMap.put('R', (byte)0xcc);
            cMap.put('S', (byte)0xcd);
            cMap.put('T', (byte)0xce);
            cMap.put('U', (byte)0xcf);
            cMap.put('V', (byte)0xd0);
            cMap.put('W', (byte)0xd1);
            cMap.put('X', (byte)0xd2);
            cMap.put('Y', (byte)0xd3);
            cMap.put('Z', (byte)0xd4);
            cMap.put('a', (byte)0xd5);
            cMap.put('b', (byte)0xd6);
            cMap.put('c', (byte)0xd7);
            cMap.put('d', (byte)0xd8);
            cMap.put('e', (byte)0xd9);
            cMap.put('f', (byte)0xda);
            cMap.put('g', (byte)0xdb);
            cMap.put('h', (byte)0xdc);
            cMap.put('i', (byte)0xdd);
            cMap.put('j', (byte)0xde);
            cMap.put('k', (byte)0xdf);
            cMap.put('l', (byte)0xe0);
            cMap.put('m', (byte)0xe1);
            cMap.put('n', (byte)0xe2);
            cMap.put('o', (byte)0xe3);
            cMap.put('p', (byte)0xe4);
            cMap.put('q', (byte)0xe5);
            cMap.put('r', (byte)0xe6);
            cMap.put('s', (byte)0xe7);
            cMap.put('t', (byte)0xe8);
            cMap.put('u', (byte)0xe9);
            cMap.put('v', (byte)0xea);
            cMap.put('w', (byte)0xeb);
            cMap.put('x', (byte)0xec);
            cMap.put('y', (byte)0xed);
            cMap.put('z', (byte)0xee);
            cMap.put(':', (byte)0xf0);
            cMap.put('_', (byte)0x0);
            cMap.put('␣', (byte)0x0);
        } else {
            cMap.put('…', (byte)0xb0);
            cMap.put('‥', (byte)0xb0);
            cMap.put('–', (byte)0xae);
            cMap.put('･', (byte)0xaf);
            cMap.put('・', (byte)0xaf);
            cMap.put('_', (byte)0x0);
            cMap.put('␣', (byte)0x0);
        }
        return cMap;
    }
    private static final Map<Language, Map<Character, Byte>> rubyCharacterMapsR =
            Map.of(
                    Language.JAPANESE, buildCharacterMapR(
                            Version.RS, Language.JAPANESE
                    ),
                    Language.ENGLISH, buildCharacterMapR(
                            Version.RS, Language.ENGLISH
                    ),
                    Language.FRENCH, buildCharacterMapR(
                            Version.RS, Language.FRENCH
                    ),
                    Language.ITALIAN, buildCharacterMapR(
                            Version.RS, Language.ITALIAN
                    ),
                    Language.GERMAN, buildCharacterMapR(
                            Version.RS, Language.GERMAN
                    ),
                    Language.SPANISH, buildCharacterMapR(
                            Version.RS, Language.SPANISH
                    )
            );
    private static final Map<Language, Map<Character, Byte>> fireredCharacterMapsR =
            Map.of(
                    Language.JAPANESE, buildCharacterMapR(
                            Version.FRLG, Language.JAPANESE
                    ),
                    Language.ENGLISH, buildCharacterMapR(
                            Version.FRLG, Language.ENGLISH
                    ),
                    Language.FRENCH, buildCharacterMapR(
                            Version.FRLG, Language.FRENCH
                    ),
                    Language.ITALIAN, buildCharacterMapR(
                            Version.FRLG, Language.ITALIAN
                    ),
                    Language.GERMAN, buildCharacterMapR(
                            Version.FRLG, Language.GERMAN
                    ),
                    Language.SPANISH, buildCharacterMapR(
                            Version.FRLG, Language.SPANISH
                    )
            );
    private static final Map<Language, Map<Character, Byte>> emeraldCharacterMapsR =
            Map.of(
                    Language.JAPANESE, buildCharacterMapR(
                            Version.E, Language.JAPANESE
                    ),
                    Language.ENGLISH, buildCharacterMapR(
                            Version.E, Language.ENGLISH
                    ),
                    Language.FRENCH, buildCharacterMapR(
                            Version.E, Language.FRENCH
                    ),
                    Language.ITALIAN, buildCharacterMapR(
                            Version.E, Language.ITALIAN
                    ),
                    Language.GERMAN, buildCharacterMapR(
                            Version.E, Language.GERMAN
                    ),
                    Language.SPANISH, buildCharacterMapR(
                            Version.E, Language.SPANISH
                    )
            );
    public static Map<Character, Byte> getCharacterMapR(
            Version version, Language language
    ) {
        return switch (version) {
            case RS -> rubyCharacterMapsR.get(language);
            case E -> emeraldCharacterMapsR.get(language);
            case FRLG -> fireredCharacterMapsR.get(language);
        };
    }
    public static String getRseString(
            byte[] data,
            Version version,
            Language language
    ) {
        Map<Byte, Character> cMap = getCharacterMap(version, language);
        char placeholder = cMap.get((byte)0);
        StringBuilder sb = new StringBuilder(data.length);
        for (byte b : data) {
            sb.append(cMap.getOrDefault(b, placeholder));
        }
        return sb.toString();
    }
    public static byte[] getRseBytes(
            String data,
            Version version,
            Language language
    ) {
        byte[] out = new byte[data.length()];
        Map<Character, Byte> cMap = getCharacterMapR(version, language);
        for (int i = 0; i < out.length; i++) {
            out[i] = cMap.getOrDefault(
                    data.charAt(i),
                    (byte)0x0
            );
        }
        return out;
    }
}
