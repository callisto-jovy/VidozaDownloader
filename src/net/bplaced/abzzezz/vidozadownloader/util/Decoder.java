package net.bplaced.abzzezz.vidozadownloader.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class Decoder {

    public String decodeVidoza(final String url) throws IOException {
        final Document document = Jsoup.connect(url).userAgent(Constant.USER_AGENT).parser(Parser.xmlParser()).get();
        return document.getElementsByTag("source").attr("src");
    }
}
