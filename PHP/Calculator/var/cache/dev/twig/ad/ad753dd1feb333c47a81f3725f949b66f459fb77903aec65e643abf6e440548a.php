<?php

/* base.html.twig */
class __TwigTemplate_72ed2cd6e84b944d15811688e639f4bcff134d56e99d3b3d73786a7c94fc6864 extends Twig_Template
{
    public function __construct(Twig_Environment $env)
    {
        parent::__construct($env);

        $this->parent = false;

        $this->blocks = array(
            'title' => array($this, 'block_title'),
            'stylesheets' => array($this, 'block_stylesheets'),
            'body_id' => array($this, 'block_body_id'),
            'header' => array($this, 'block_header'),
            'body' => array($this, 'block_body'),
            'main' => array($this, 'block_main'),
            'javascripts' => array($this, 'block_javascripts'),
        );
    }

    protected function doDisplay(array $context, array $blocks = array())
    {
        $__internal_9f32eb64f1513df27138c6962b459d4d4b724be2d41a7bbe022e2faa589d26ee = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_9f32eb64f1513df27138c6962b459d4d4b724be2d41a7bbe022e2faa589d26ee->enter($__internal_9f32eb64f1513df27138c6962b459d4d4b724be2d41a7bbe022e2faa589d26ee_prof = new Twig_Profiler_Profile($this->getTemplateName(), "template", "base.html.twig"));

        // line 6
        echo "<!DOCTYPE html>
<html lang=\"en-US\">
<head>
    <meta charset=\"UTF-8\"/>
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>
    <title>";
        // line 11
        $this->displayBlock('title', $context, $blocks);
        echo "</title>
    ";
        // line 12
        $this->displayBlock('stylesheets', $context, $blocks);
        // line 16
        echo "    <link rel=\"icon\" type=\"image/x-icon\" href=\"";
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("favicon.ico"), "html", null, true);
        echo "\"/>
</head>

<body id=\"";
        // line 19
        $this->displayBlock('body_id', $context, $blocks);
        echo "\">

";
        // line 21
        $this->displayBlock('header', $context, $blocks);
        // line 39
        echo "
<div class=\"container body-container\">
    ";
        // line 41
        $this->displayBlock('body', $context, $blocks);
        // line 48
        echo "</div>


";
        // line 51
        $this->displayBlock('javascripts', $context, $blocks);
        // line 57
        echo "
</body>
</html>
";
        
        $__internal_9f32eb64f1513df27138c6962b459d4d4b724be2d41a7bbe022e2faa589d26ee->leave($__internal_9f32eb64f1513df27138c6962b459d4d4b724be2d41a7bbe022e2faa589d26ee_prof);

    }

    // line 11
    public function block_title($context, array $blocks = array())
    {
        $__internal_5fac9cb76c7ea79c072195e198d3d34228a85006b60d634d4be5d02322a7fdce = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_5fac9cb76c7ea79c072195e198d3d34228a85006b60d634d4be5d02322a7fdce->enter($__internal_5fac9cb76c7ea79c072195e198d3d34228a85006b60d634d4be5d02322a7fdce_prof = new Twig_Profiler_Profile($this->getTemplateName(), "block", "title"));

        echo "Calculator";
        
        $__internal_5fac9cb76c7ea79c072195e198d3d34228a85006b60d634d4be5d02322a7fdce->leave($__internal_5fac9cb76c7ea79c072195e198d3d34228a85006b60d634d4be5d02322a7fdce_prof);

    }

    // line 12
    public function block_stylesheets($context, array $blocks = array())
    {
        $__internal_38251b79d969fe772fb785be46eb86091930820033d6d9d371cb803d5b303d9e = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_38251b79d969fe772fb785be46eb86091930820033d6d9d371cb803d5b303d9e->enter($__internal_38251b79d969fe772fb785be46eb86091930820033d6d9d371cb803d5b303d9e_prof = new Twig_Profiler_Profile($this->getTemplateName(), "block", "stylesheets"));

        // line 13
        echo "        <link rel=\"stylesheet\" href=\"";
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("css/style.css"), "html", null, true);
        echo "\">
        <link rel=\"stylesheet\" href=\"";
        // line 14
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("css/bootstrap-datetimepicker.min.css"), "html", null, true);
        echo "\">
    ";
        
        $__internal_38251b79d969fe772fb785be46eb86091930820033d6d9d371cb803d5b303d9e->leave($__internal_38251b79d969fe772fb785be46eb86091930820033d6d9d371cb803d5b303d9e_prof);

    }

    // line 19
    public function block_body_id($context, array $blocks = array())
    {
        $__internal_98985df512e899cef01e258c2ac28153bf6221967b683a1a60caa5e8449d6cff = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_98985df512e899cef01e258c2ac28153bf6221967b683a1a60caa5e8449d6cff->enter($__internal_98985df512e899cef01e258c2ac28153bf6221967b683a1a60caa5e8449d6cff_prof = new Twig_Profiler_Profile($this->getTemplateName(), "block", "body_id"));

        
        $__internal_98985df512e899cef01e258c2ac28153bf6221967b683a1a60caa5e8449d6cff->leave($__internal_98985df512e899cef01e258c2ac28153bf6221967b683a1a60caa5e8449d6cff_prof);

    }

    // line 21
    public function block_header($context, array $blocks = array())
    {
        $__internal_930a54301b7f3bbf501e6d0ff49c580790c5b65d177f3eee41afac62757d971d = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_930a54301b7f3bbf501e6d0ff49c580790c5b65d177f3eee41afac62757d971d->enter($__internal_930a54301b7f3bbf501e6d0ff49c580790c5b65d177f3eee41afac62757d971d_prof = new Twig_Profiler_Profile($this->getTemplateName(), "block", "header"));

        // line 22
        echo "    <header>
        <div class=\"navbar navbar-default navbar-static-top\" role=\"navigation\">
            <div class=\"container\">
                <div class=\"navbar-header\">
                    <a href=\"";
        // line 26
        echo $this->env->getExtension('Symfony\Bridge\Twig\Extension\RoutingExtension')->getPath("index");
        echo "\" class=\"navbar-brand\">CALCULATOR</a>

                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">
                        <span class=\"icon-bar\"></span>
                        <span class=\"icon-bar\"></span>
                        <span class=\"icon-bar\"></span>
                    </button>
                </div>

            </div>
        </div>
    </header>
";
        
        $__internal_930a54301b7f3bbf501e6d0ff49c580790c5b65d177f3eee41afac62757d971d->leave($__internal_930a54301b7f3bbf501e6d0ff49c580790c5b65d177f3eee41afac62757d971d_prof);

    }

    // line 41
    public function block_body($context, array $blocks = array())
    {
        $__internal_10a451df9247cb249a0173990c312489c084748163bf67cbd7ef1a65cffcbb38 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_10a451df9247cb249a0173990c312489c084748163bf67cbd7ef1a65cffcbb38->enter($__internal_10a451df9247cb249a0173990c312489c084748163bf67cbd7ef1a65cffcbb38_prof = new Twig_Profiler_Profile($this->getTemplateName(), "block", "body"));

        // line 42
        echo "        <div class=\"row\">
            <div id=\"main\" class=\"col-sm-9\">
                ";
        // line 44
        $this->displayBlock('main', $context, $blocks);
        // line 45
        echo "            </div>
        </div>
    ";
        
        $__internal_10a451df9247cb249a0173990c312489c084748163bf67cbd7ef1a65cffcbb38->leave($__internal_10a451df9247cb249a0173990c312489c084748163bf67cbd7ef1a65cffcbb38_prof);

    }

    // line 44
    public function block_main($context, array $blocks = array())
    {
        $__internal_3124abebc5c0e70f35444f52ef9e7932faeba3932d88e86624b0f42e79b804ee = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_3124abebc5c0e70f35444f52ef9e7932faeba3932d88e86624b0f42e79b804ee->enter($__internal_3124abebc5c0e70f35444f52ef9e7932faeba3932d88e86624b0f42e79b804ee_prof = new Twig_Profiler_Profile($this->getTemplateName(), "block", "main"));

        
        $__internal_3124abebc5c0e70f35444f52ef9e7932faeba3932d88e86624b0f42e79b804ee->leave($__internal_3124abebc5c0e70f35444f52ef9e7932faeba3932d88e86624b0f42e79b804ee_prof);

    }

    // line 51
    public function block_javascripts($context, array $blocks = array())
    {
        $__internal_65f30fde7f47f91509729b4c7715eae6ba2774b9a9ebd93d7dbb23296ea0209e = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_65f30fde7f47f91509729b4c7715eae6ba2774b9a9ebd93d7dbb23296ea0209e->enter($__internal_65f30fde7f47f91509729b4c7715eae6ba2774b9a9ebd93d7dbb23296ea0209e_prof = new Twig_Profiler_Profile($this->getTemplateName(), "block", "javascripts"));

        // line 52
        echo "    <script src=\"";
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("js/jquery-2.2.4.min.js"), "html", null, true);
        echo "\"></script>
    <script src=\"";
        // line 53
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("js/moment.min.js"), "html", null, true);
        echo "\"></script>
    <script src=\"";
        // line 54
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("js/bootstrap.js"), "html", null, true);
        echo "\"></script>
    <script src=\"";
        // line 55
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("js/bootstrap-datetimepicker.min.js"), "html", null, true);
        echo "\"></script>
";
        
        $__internal_65f30fde7f47f91509729b4c7715eae6ba2774b9a9ebd93d7dbb23296ea0209e->leave($__internal_65f30fde7f47f91509729b4c7715eae6ba2774b9a9ebd93d7dbb23296ea0209e_prof);

    }

    public function getTemplateName()
    {
        return "base.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  205 => 55,  201 => 54,  197 => 53,  192 => 52,  186 => 51,  175 => 44,  166 => 45,  164 => 44,  160 => 42,  154 => 41,  134 => 26,  128 => 22,  122 => 21,  111 => 19,  102 => 14,  97 => 13,  91 => 12,  79 => 11,  69 => 57,  67 => 51,  62 => 48,  60 => 41,  56 => 39,  54 => 21,  49 => 19,  42 => 16,  40 => 12,  36 => 11,  29 => 6,);
    }

    public function getSource()
    {
        return "{#
   This is the base template used as the application layout which contains the
   common elements and decorates all the other templates.
   See http://symfony.com/doc/current/book/templating.html#template-inheritance-and-layouts
#}
<!DOCTYPE html>
<html lang=\"en-US\">
<head>
    <meta charset=\"UTF-8\"/>
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>
    <title>{% block title %}Calculator{% endblock %}</title>
    {% block stylesheets %}
        <link rel=\"stylesheet\" href=\"{{ asset('css/style.css') }}\">
        <link rel=\"stylesheet\" href=\"{{ asset('css/bootstrap-datetimepicker.min.css') }}\">
    {% endblock %}
    <link rel=\"icon\" type=\"image/x-icon\" href=\"{{ asset('favicon.ico') }}\"/>
</head>

<body id=\"{% block body_id %}{% endblock %}\">

{% block header %}
    <header>
        <div class=\"navbar navbar-default navbar-static-top\" role=\"navigation\">
            <div class=\"container\">
                <div class=\"navbar-header\">
                    <a href=\"{{ path('index') }}\" class=\"navbar-brand\">CALCULATOR</a>

                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">
                        <span class=\"icon-bar\"></span>
                        <span class=\"icon-bar\"></span>
                        <span class=\"icon-bar\"></span>
                    </button>
                </div>

            </div>
        </div>
    </header>
{% endblock %}

<div class=\"container body-container\">
    {% block body %}
        <div class=\"row\">
            <div id=\"main\" class=\"col-sm-9\">
                {% block main %}{% endblock %}
            </div>
        </div>
    {% endblock %}
</div>


{% block javascripts %}
    <script src=\"{{ asset('js/jquery-2.2.4.min.js') }}\"></script>
    <script src=\"{{ asset('js/moment.min.js') }}\"></script>
    <script src=\"{{ asset('js/bootstrap.js') }}\"></script>
    <script src=\"{{ asset('js/bootstrap-datetimepicker.min.js') }}\"></script>
{% endblock %}

</body>
</html>
";
    }
}
