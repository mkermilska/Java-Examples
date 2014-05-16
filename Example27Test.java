import static org.junit.Assert.*;

import org.junit.Test;


public class Example27Test {

	@Test
	public final void testReduce_file_path() {
		
		assertEquals("/", Example27.reduce_file_path("/"));
		assertEquals("/", Example27.reduce_file_path("/srv/../"));
		assertEquals("/srv/www/htdocs/wtf", Example27.reduce_file_path("/srv/www/htdocs/wtf/"));
		assertEquals("/srv/www/htdocs/wtf", Example27.reduce_file_path("/srv/www/htdocs/wtf"));
		assertEquals("/srv", Example27.reduce_file_path("/srv/./././././"));
		assertEquals("/etc/wtf", Example27.reduce_file_path("/etc//wtf/"));
		assertEquals("/", Example27.reduce_file_path("/etc/../etc/../etc/../"));
		assertEquals("/", Example27.reduce_file_path("//////////////"));
		assertEquals("/", Example27.reduce_file_path("/../"));
	}

}
