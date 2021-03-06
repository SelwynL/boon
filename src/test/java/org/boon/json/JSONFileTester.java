package org.boon.json;

import org.boon.IO;

import java.util.List;
import java.util.Map;

import static org.boon.Boon.puts;

public class JSONFileTester {


    public static void main (String... args) {



        final List<String> list = IO.listByExt ( "files", ".json" );

        for ( String file : list ) {


            puts ( "testing", file );

            final Map<String,Object> map = JSONParser.parseMap ( IO.read ( file ) );

            puts ( map );
        }


    }
}
