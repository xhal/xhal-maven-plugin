package cc.xhal.maven.plugins.mojo;

import org.apache.maven.execution.MavenSession;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecution;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.descriptor.PluginDescriptor;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.apache.maven.settings.Settings;

import java.io.File;

/**
 * Svn 信息 Mojo
 *
 * @author hal
 * @since 2021-03-12
 */
@Mojo(name = "revision", defaultPhase = LifecyclePhase.VALIDATE)
public class SvnMojo extends AbstractMojo {

    @Parameter(defaultValue = "${session}", readonly = true)
    private MavenSession session;

    @Parameter(defaultValue = "${project}", readonly = true)
    private MavenProject project;

    @Parameter(defaultValue = "${mojoExecution}", readonly = true)
    private MojoExecution mojo;

    @Parameter(defaultValue = "${plugin}", readonly = true)
    private PluginDescriptor plugin;

    @Parameter(defaultValue = "${settings}", readonly = true)
    private Settings settings;

    @Parameter(defaultValue = "${project.basedir}", readonly = true)
    private File basedir;

    @Parameter(defaultValue = "${project.build.directory}", readonly = true)
    private File target;

    @Parameter(name = "revisionName", defaultValue = "revision")
    private String revisionName;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("hello xhalSvn  revision mojo ！！！");

        getLog().info("basedir= " + basedir.getAbsolutePath());
        getLog().info("target= " + target.getAbsolutePath());
        getLog().info("revisionName= " + revisionName);
    }

}
